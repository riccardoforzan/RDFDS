package search

import indexing.DocumentField
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.index.DirectoryReader
import org.apache.lucene.index.IndexReader
import org.apache.lucene.search.IndexSearcher
import org.apache.lucene.search.ScoreDoc
import org.apache.lucene.search.similarities.Similarity
import org.apache.lucene.store.FSDirectory
import search.query.QueryBuilder
import java.io.BufferedReader
import java.io.FileReader
import java.io.PrintWriter
import java.nio.file.Paths
import java.util.*

class Searcher(
    indexPath: String,
    private val analyzer: Analyzer,
    private val similarity: Similarity,
    private val queryType: QueryBuilder,
    queryFilePath: String,
    private val maxNumberOfDocuments: Int
) {

    data class Query(val id: Int, val text: String)

    private val reader: IndexReader
    private val searcher: IndexSearcher
    private val queries = ArrayList<Query>()

    init {
        val indexDir = Paths.get(indexPath)
        reader = DirectoryReader.open(FSDirectory.open(indexDir))
        searcher = IndexSearcher(reader)
        searcher.similarity = similarity

        val input = FileReader(queryFilePath)
        BufferedReader(input).forEachLine {
            val parts = it.split("\t")
            val query = Query(parts[0].toInt(), parts[1])
            queries.add(query)
        }

    }

    fun searchInMetadataOnly(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.TITLE,
            DocumentField.DESCRIPTION,
            DocumentField.AUTHOR,
            DocumentField.TAGS
        )

        for (query in queries) {
            val queryID = query.id
            val q = queryType.buildQuery(fields, similarity, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }

    }

    fun searchInNodesOnly(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.NODES
        )

        for (query in queries) {
            val queryID = query.id
            val q = queryType.buildQuery(fields, similarity, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }

    }

    fun searchInExtractedDataOnly(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.CLASSES,
            DocumentField.LITERALS,
            DocumentField.ENTITIES,
            DocumentField.PROPERTIES
        )

        for (query in queries) {
            val queryID = query.id
            val q = queryType.buildQuery(fields, similarity, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }

    }

    fun searchInMetadataAndNodes(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.TITLE,
            DocumentField.DESCRIPTION,
            DocumentField.AUTHOR,
            DocumentField.TAGS,
            DocumentField.NODES,
        )

        for (query in queries) {
            val queryID = query.id
            val q = queryType.buildQuery(fields, similarity, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }

    }

    fun searchInExtractedDataAndNodes(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.NODES,
            DocumentField.CLASSES,
            DocumentField.LITERALS,
            DocumentField.ENTITIES,
            DocumentField.PROPERTIES
        )

        for (query in queries) {
            val queryID = query.id
            val q = queryType.buildQuery(fields, similarity, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }

    }

    fun searchAcrossAllData(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.TITLE,
            DocumentField.DESCRIPTION,
            DocumentField.AUTHOR,
            DocumentField.TAGS,
            DocumentField.CLASSES,
            DocumentField.LITERALS,
            DocumentField.ENTITIES,
            DocumentField.PROPERTIES
        )

        for (query in queries) {
            val queryID = query.id
            val q = queryType.buildQuery(fields, similarity, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }
    }

    fun searchAcrossAllDataAndNodes(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.TITLE,
            DocumentField.DESCRIPTION,
            DocumentField.AUTHOR,
            DocumentField.TAGS,
            DocumentField.NODES,
            DocumentField.CLASSES,
            DocumentField.LITERALS,
            DocumentField.ENTITIES,
            DocumentField.PROPERTIES
        )

        for (query in queries) {
            val queryID = query.id
            val q = queryType.buildQuery(fields, similarity, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }
    }

    private fun writeHits(runIdentifier: String, queryID: Int, hits: Array<ScoreDoc>, writer: PrintWriter) {
        for ((index, hit) in hits.withIndex()) {
            val doc = reader.storedFields().document(hit.doc)
            writer.printf(
                Locale.ENGLISH,
                "%s\tQ0\t%s\t%d\t%.6f\t%s%n",
                queryID,
                doc.get(DocumentField.ID.name),
                index + 1,
                hit.score,
                runIdentifier
            )
        }
    }

}