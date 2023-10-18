# Run results

## Raw Collection: Raw Downloaded
This dataset contains the raw downloaded data.

## Refined Collection: Processed
Derived from the Raw Collection. It has the following modifications:
- Removed JSON and HTML error files
- Decompressed archives
- Correct extensions assigned to files

## Flags Used to Identify Runs

Standard configuration (assume it if not specified):
    - No stoplist
    - Standard Analyzer

- **Type of Analyzer**:
    - `big-stoplist`: Standard Analyzer with stoplist for `en` downloaded from Kaggle
    - `nltk`: Standard Analyzer with NLTK stoplist for `en`

- **Type of Query**:
    - `mfq`: Multi-field Query
    - `mfq-boost`: Multi-field Query with boosting (weights from ACORDAR 2.0)

- **Other**:
    - `no-empty`: Empty datasets (datasets for which only metadata is available) not indexed and removed from QRELS
