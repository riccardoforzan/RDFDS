package search.query

import indexing.DocumentField
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser
import org.apache.lucene.queryparser.classic.QueryParserBase
import org.apache.lucene.search.Query
import org.apache.lucene.search.similarities.BM25Similarity
import org.apache.lucene.search.similarities.ClassicSimilarity
import org.apache.lucene.search.similarities.LMDirichletSimilarity
import org.apache.lucene.search.similarities.Similarity


class ClassicQueryBoosted : QueryBuilder {

    private val tfidfCompleteWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.TITLE to 1f,
        DocumentField.DESCRIPTION to 0.7f,
        DocumentField.AUTHOR to 0.9f,
        DocumentField.TAGS to 0.9f,
        DocumentField.ENTITIES to 0.8f,
        DocumentField.LITERALS to 0.5f,
        DocumentField.CLASSES to 0.1f,
        DocumentField.PROPERTIES to 0.4f
    )

    private val bm25CompleteWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.TITLE to 1f,
        DocumentField.DESCRIPTION to 0.9f,
        DocumentField.AUTHOR to 0.9f,
        DocumentField.TAGS to 0.6f,
        DocumentField.ENTITIES to 0.2f,
        DocumentField.LITERALS to 0.3f,
        DocumentField.CLASSES to 0.1f,
        DocumentField.PROPERTIES to 0.1f
    )

    private val lmdCompleteWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.TITLE to 1f,
        DocumentField.DESCRIPTION to 0.9f,
        DocumentField.AUTHOR to 0.1f,
        DocumentField.TAGS to 1f,
        DocumentField.ENTITIES to 0.2f,
        DocumentField.LITERALS to 0.3f,
        DocumentField.CLASSES to 0.2f,
        DocumentField.PROPERTIES to 0.1f
    )

    private val tfidfMetadataWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.TITLE to 1f,
        DocumentField.DESCRIPTION to 0.6f,
        DocumentField.AUTHOR to 0.4f,
        DocumentField.TAGS to 0.5f
    )

    private val bm25MetadataWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.TITLE to 0.5f,
        DocumentField.DESCRIPTION to 0.3f,
        DocumentField.AUTHOR to 0.2f,
        DocumentField.TAGS to 0.2f
    )

    private val lmdMetadataWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.TITLE to 1f,
        DocumentField.DESCRIPTION to 0.8f,
        DocumentField.AUTHOR to 0.9f,
        DocumentField.TAGS to 0.7f
    )

    private val tfidfDataWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.ENTITIES to 0.3f,
        DocumentField.LITERALS to 1f,
        DocumentField.CLASSES to 0.6f,
        DocumentField.PROPERTIES to 0.3f
    )

    private val bm25DataWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.ENTITIES to 0.1f,
        DocumentField.LITERALS to 0.7f,
        DocumentField.CLASSES to 0.2f,
        DocumentField.PROPERTIES to 0.2f
    )

    private val lmdDataWeights: Map<DocumentField, Float> = mapOf(
        DocumentField.ENTITIES to 0.3f,
        DocumentField.LITERALS to 1f,
        DocumentField.CLASSES to 0.1f,
        DocumentField.PROPERTIES to 0.6f
    )

    override fun buildQuery(
        fields: Array<DocumentField>,
        similarity: Similarity,
        analyzer: Analyzer,
        queryText: String
    ): Query {

        val weightsMap = when (similarity) {
            is ClassicSimilarity -> mapOf(
                tfidfCompleteWeights.keys to tfidfCompleteWeights,
                tfidfMetadataWeights.keys to tfidfMetadataWeights,
                tfidfDataWeights.keys to tfidfDataWeights
            )

            is BM25Similarity -> mapOf(
                bm25CompleteWeights.keys to bm25CompleteWeights,
                bm25MetadataWeights.keys to bm25MetadataWeights,
                bm25DataWeights.keys to bm25DataWeights
            )

            is LMDirichletSimilarity -> mapOf(
                lmdCompleteWeights.keys to lmdCompleteWeights,
                lmdMetadataWeights.keys to lmdMetadataWeights,
                lmdDataWeights.keys to lmdDataWeights
            )

            else -> null
        }

        if (weightsMap != null) {
            val weightKeys = weightsMap.keys.find { fields.toList().containsAll(it) }
            val weightValues = weightsMap[weightKeys]

            if (weightKeys != null && weightValues != null && fields.size == weightKeys.size) {
                val fieldNames = fields.map { it.name }.toTypedArray()
                val queryEscaped = QueryParserBase.escape(queryText)
                val queryParser = MultiFieldQueryParser(fieldNames, analyzer, weightValues.mapKeys { it.key.name })
                return queryParser.parse(queryEscaped)
            }
        }

        throw IllegalStateException()

    }
}