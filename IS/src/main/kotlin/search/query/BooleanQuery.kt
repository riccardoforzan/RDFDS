package search.query

import indexing.DocumentField
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.queryparser.classic.QueryParser
import org.apache.lucene.search.BooleanClause
import org.apache.lucene.search.BooleanQuery
import org.apache.lucene.search.Query
import org.apache.lucene.search.similarities.Similarity

class BooleanQuery : QueryBuilder {

    override fun buildQuery(
        fields: Array<DocumentField>,
        similarity: Similarity,
        analyzer: Analyzer,
        queryText: String
    ): Query {
        val booleanQuery = BooleanQuery.Builder()

        for (field in fields) {
            val escapedQueryText = QueryParser.escape(queryText)
            val parsedQuery = QueryParser(field.name, analyzer).parse(escapedQueryText)
            booleanQuery.add(BooleanClause(parsedQuery, BooleanClause.Occur.SHOULD))
        }

        return booleanQuery.build()
    }

}