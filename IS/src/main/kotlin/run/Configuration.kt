package run

import indexing.DatasetFolderReader
import indexing.Indexer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.search.similarities.BM25Similarity
import org.apache.lucene.search.similarities.ClassicSimilarity
import org.apache.lucene.search.similarities.LMDirichletSimilarity
import org.apache.lucene.search.similarities.Similarity
import search.Searcher
import search.query.QueryBuilder
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter


class Configuration(
    private val analyzer: Analyzer,
    private val indexFolder: String,
    private val datasetsFolderPath: String,
    private val skipEmptyDataset: Boolean = false,
    private val useNodesFile: Boolean = false
) {

    private val logger: Logger = LogManager.getLogger()

    fun createIndex() {
        logger.info("Creating index in $indexFolder")
        val indexer = Indexer(datasetsFolderPath, indexFolder, analyzer, skipEmptyDataset, useNodesFile)
        val metadataFiles = DatasetFolderReader(datasetsFolderPath).getMetadataFilesPath().sorted()
        indexer.indexFiles(metadataFiles)
        logger.info("Indexing complete!")
    }

    fun search(queryType: QueryBuilder, outputFolderPath: String, maxNumberOfDocuments: Int) {

        val directory = File(outputFolderPath)
        if (!directory.mkdirs() && !directory.exists()) {
            throw RuntimeException("Failed to create directory: $outputFolderPath")
        }

        produceResults(
            indexFolder,
            analyzer,
            ClassicSimilarity(),
            queryType,
            "CS",
            outputFolderPath,
            maxNumberOfDocuments,
            useNodesFile
        )

        produceResults(
            indexFolder,
            analyzer,
            BM25Similarity(),
            queryType,
            "BM25",
            outputFolderPath,
            maxNumberOfDocuments,
            useNodesFile
        )

        produceResults(
            indexFolder,
            analyzer,
            LMDirichletSimilarity(),
            queryType,
            "LMD",
            outputFolderPath,
            maxNumberOfDocuments,
            useNodesFile
        )
    }

    private fun produceResults(
        indexFolder: String,
        analyzer: Analyzer,
        similarity: Similarity,
        queryType: QueryBuilder,
        runIdentifier: String,
        outputFolder: String,
        maxNumberOfDocuments: Int,
        useNodesFile: Boolean
    ) {

        fun performQueries(queryListName: String, queryFile: String) {

            val searcher = Searcher(indexFolder, analyzer, similarity, queryType, queryFile, maxNumberOfDocuments)

            val queries = mutableListOf(
                "META",
                "EXTRACTED",
                "META+EXTRACTED",
            )

            if (useNodesFile) {
                queries.addAll(
                    listOf(
                        "NODES",
                        "META+NODES",
                        "EXTRACTED+NODES",
                        "META+EXTRACTED+NODES"
                    )
                )
            }

            queries.forEach { query ->
                val runID = "$runIdentifier-$query-$queryListName-QUERIES"

                logger.info("Querying $runID ...")

                val outputFile = FileWriter("$outputFolder/$runID-output.txt")
                val writer = PrintWriter(outputFile)

                when (query) {
                    "META" -> searcher.searchInMetadataOnly(runID, writer)
                    "EXTRACTED" -> searcher.searchInExtractedDataOnly(runID, writer)
                    "META+EXTRACTED" -> searcher.searchAcrossAllData(runID, writer)
                    "NODES" -> searcher.searchInNodesOnly(runID, writer)
                    "META+NODES" -> searcher.searchInMetadataAndNodes(runID, writer)
                    "EXTRACTED+NODES" -> searcher.searchInExtractedDataAndNodes(runID, writer)
                    "META+EXTRACTED+NODES" -> searcher.searchAcrossAllDataAndNodes(runID, writer)
                }

                writer.close()
                logger.info("Completed")
            }
        }

        // PERFORM SYNTHETIC QUERIES
        performQueries("SYN", "queries/synthetic_queries.txt")

        // PERFORM TREC QUERIES
        performQueries("TREC", "queries/trec_queries.txt")

        // PERFORM ALL QUERIES
        performQueries("ALL", "queries/all_queries.txt")

    }

}