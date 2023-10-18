package search.query

import indexing.DocumentField
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser
import org.apache.lucene.queryparser.classic.QueryParserBase
import org.apache.lucene.search.Query
import org.apache.lucene.search.similarities.Similarity


class ClassicQuery : QueryBuilder {
    override fun buildQuery(
        fields: Array<DocumentField>,
        similarity: Similarity,
        analyzer: Analyzer,
        queryText: String
    ): Query {
        val fieldNames = fields.map { it.name }.toTypedArray()
        val queryEscaped = QueryParserBase.escape(queryText)
        val queryParser = MultiFieldQueryParser(fieldNames, analyzer)
        return queryParser.parse(queryEscaped)
    }
}