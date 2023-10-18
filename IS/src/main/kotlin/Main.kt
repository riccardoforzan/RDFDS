import org.apache.lucene.analysis.standard.StandardAnalyzer
import run.Configuration
import search.query.ClassicQuery
import java.nio.file.Paths

fun main(args: Array<String>) {

    val datasetsFolderPath = "../datasets"
    val path = Paths.get("").toAbsolutePath().toString()
    println("Working directory: $path, Datasets in $datasetsFolderPath")

    // Max number of retrieved documents
    val maxNumberOfDocuments = 10
    val classloader = Thread.currentThread().contextClassLoader

    val vanillaConfiguration =
        Configuration(StandardAnalyzer(), "index-vanilla", datasetsFolderPath, useNodesFile = true)
    vanillaConfiguration.createIndex()
    vanillaConfiguration.search(ClassicQuery(), "output/dataset-v2-nodes_no_empty-vanilla-mfq", maxNumberOfDocuments)

    // Analyzer with NLTK stop list
    val nltkStopList = classloader.getResourceAsStream("stoplists/nltk_en.txt")!!.reader()
    val nltkConfiguration =
        Configuration(StandardAnalyzer(nltkStopList), "index-nltk", datasetsFolderPath, useNodesFile = true)
    nltkConfiguration.createIndex()
    nltkConfiguration.search(ClassicQuery(), "output/dataset-v2-nodes_no_empty-nltk-mfq", maxNumberOfDocuments)

    /*
    // Analyzer with big stop list
    val bigStopList = classloader.getResourceAsStream("stoplists/big_en.txt")!!.reader()
    val bigStopListConfiguration = Configuration(StandardAnalyzer(bigStopList), "index-bsl", datasetsFolderPath)
    bigStopListConfiguration.createIndex()
    bigStopListConfiguration.search(BooleanQuery(), "output/bsl-bq", maxNumberOfDocuments)
    bigStopListConfiguration.search(ClassicQuery(), "output/bsl-cq", maxNumberOfDocuments)
    //bigStopListConfiguration.search(ClassicQueryBoosted(), "output/bsl-cq-boost", maxNumberOfDocuments)
     */

}




