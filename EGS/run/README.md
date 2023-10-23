# RUN

- **Run configurations**:
    - `no-empty` empty datasets (datasets for which only metadata is available) not indexed and removed from QRELS
    - `nodes_no_empty` removed from the datasets and from the qrels all the datasets having an empty nodes file (i.e. no node can be extracted)

- **Type of Analyzer**:
    - `vanilla`: Standard Analyzer
    - `big-stoplist`: Standard Analyzer with stoplist for `en` downloaded from Kaggle
    - `nltk`: Standard Analyzer with NLTK stoplist for `en`

- **Type of Query**:
    - `mfq`: Multi-field Query
    - `mfq-boost`: Multi-field Query with boosting (weights from ACORDAR 2.0)
