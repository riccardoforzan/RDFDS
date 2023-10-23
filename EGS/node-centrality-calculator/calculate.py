import json
import os
import logging
import argparse
import multiprocessing
import networkx as nx
import timeout_decorator
from rdflib import Graph
from functools import partial
from alive_progress import alive_bar
from concurrent.futures import ProcessPoolExecutor as Pool, as_completed
from rdflib.extras.external_graph_libs import rdflib_to_networkx_graph as rdf_to_nx

K = 100
TOP = 20

@timeout_decorator.timeout(100, use_signals=False, timeout_exception=TimeoutError)
def get_nx_graph(file_path: str) -> nx.Graph:
    graph = Graph()
    graph.parse(file_path)
    nx_graph = rdf_to_nx(graph)
    return nx_graph

@timeout_decorator.timeout(200, use_signals=False, timeout_exception=TimeoutError)
def get_top_nodes(graph: nx.Graph, k: int, top: int) -> list:
    """
    Return the top nodes returned by betweenness centrality of a networkx graph.

    Args:
        graph (nx.Graph): networkx graph
        k (int): number of nodes used as the starting points for the computation of betweenness centrality in a graph.
        top (int): maximum number of results to return

    Returns:
        list[tuple]: list of node URI and centrality value
    """

    # Calculate betweenness centrality using only k nodes
    bcn = nx.betweenness_centrality(graph, k=k)

    # Sort and retrieve the top nodes based on betweenness centrality
    top_nodes = sorted(bcn.items(), key=lambda x: x[1], reverse=True)[:top]

    return top_nodes


def process_dataset_files(dataset_path: str, k: int, top: int, log: logging.Logger):
    # Get all the path of the files that can be processed
    to_process = []
    with open(f"{dataset_path}/metadata.json", "r") as mf:
        metadata = json.load(mf)
        for file in metadata["extracted"]:
            if file["extractedWith"] == "RDFLib":
                file_path = f"{dataset_path}/{file['file']}"
                to_process.append(file_path)

    # Get the top nodes from every processable file
    top_nodes = []
    for file_path in to_process:

        nx_graph = None

        try:
            nx_graph = get_nx_graph(file_path)
        except TimeoutError as e:
            log.error(f"{file_path} has taken more than 100 seconds to load")
            continue

        try:
            tmp_top = get_top_nodes(nx_graph, k, top)
            top_nodes.extend(tmp_top)
            log.info(f"{file_path} has been processed")
        except TimeoutError as e:
            log.error(f"{file_path} has taken more than 200 seconds to be processed")

    # Sort the list that contains for each file its top nodes
    stn = sorted(top_nodes, key=lambda x: x[1], reverse=True)
    rs = [t[0] for t in stn]

    # Save inside a file in the folder the list of top nodes
    output_file = f"{dataset_path}/bc_nodes.txt"
    with open(output_file, "w") as file:
        file.write("\n".join("%s" % i for i in rs))

    log.info(f"{output_file} created")


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("folder", type=str, help="Folder in which datasets are stored")

    args = parser.parse_args()
    datasets_folder = args.folder

    logging.basicConfig(
        level=logging.INFO,
        filename="bc_analysis.log",
        filemode="w",
        format="%(asctime)-15s %(levelname)-8s %(message)s",
    )

    log = logging.getLogger()

    # place in a queue all the files from the dataset that have been processed through RDFLib
    to_process = []
    datasets = sorted(os.listdir(datasets_folder))
    to_process = [f"{datasets_folder}/{dataset}" for dataset in datasets]

    # Set the number of processes to use for parallel processing
    cores = multiprocessing.cpu_count() - 1

    # parametrize the function call
    process_fun = partial(process_dataset_files, k=K, top=TOP, log=log)

    with Pool(max_workers=cores) as pool, alive_bar(
        len(to_process), title="Processing...", bar="circles"
    ) as bar:
        futures = {pool.submit(process_fun, data): data for data in to_process}

        for future in as_completed(futures):
            bar()
