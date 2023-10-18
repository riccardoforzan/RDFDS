### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4733 |        0.4972 |      0.2843 |       0.3728 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4564 |        0.4744 |      0.2785 |       0.3588 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1032 |        0.1117 |      0.0581 |       0.0708 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5192 |        0.5482 |      0.3142 |       0.4187 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4917 |        0.5067 |      0.2969 |       0.3857 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1467 |        0.1511 |      0.0916 |       0.1036 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4749 |        0.5045 |      0.2973 |       0.3823 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4249 |        0.444  |      0.2644 |       0.3363 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.139  |        0.147  |      0.0881 |       0.1008 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1467 |        0.1511 |      0.0916 |       0.1036 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0884 |        0.0902 |      0.05   |       0.0584 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0583 |        0.0609 |      0.0416 |       0.0452 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5192 |        0.5482 |      0.3142 |       0.4187 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3016 |        0.3114 |      0.1813 |       0.2397 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2177 |        0.2368 |      0.1329 |       0.1789 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4917 |        0.5067 |      0.2969 |       0.3857 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2937 |        0.294  |      0.1763 |       0.2242 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.198  |        0.2127 |      0.1206 |       0.1615 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1032 |        0.1117 |      0.0581 |       0.0708 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.067  |        0.0728 |      0.0371 |       0.0462 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0362 |        0.0389 |      0.021  |       0.0246 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4733 |        0.4972 |      0.2843 |       0.3728 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2688 |        0.2743 |      0.1582 |       0.2038 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2045 |        0.2229 |      0.1261 |       0.169  |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4564 |        0.4744 |      0.2785 |       0.3588 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2677 |        0.2688 |      0.1599 |       0.202  |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1887 |        0.2056 |      0.1186 |       0.1568 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.139  |        0.147  |      0.0881 |       0.1008 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.09   |        0.093  |      0.0549 |       0.0628 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0489 |        0.054  |      0.0333 |       0.038  |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4749 |        0.5045 |      0.2973 |       0.3823 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.2718 |        0.2797 |      0.1687 |       0.2131 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.2031 |        0.2247 |      0.1286 |       0.1692 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4249 |        0.444  |      0.2644 |       0.3363 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2417 |        0.2478 |      0.1487 |       0.1871 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1832 |        0.1962 |      0.1158 |       0.1493 |
