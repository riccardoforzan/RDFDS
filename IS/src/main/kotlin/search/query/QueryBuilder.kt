package search.query

import indexing.DocumentField
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.search.Query
import org.apache.lucene.search.similarities.Similarity

interface QueryBuilder {
    fun buildQuery(fields: Array<DocumentField>, similarity: Similarity, analyzer: Analyzer, queryText: String): Query
}