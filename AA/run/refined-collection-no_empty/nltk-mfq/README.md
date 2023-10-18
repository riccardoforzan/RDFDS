### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4826 |        0.5093 |      0.2929 |       0.3896 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4643 |        0.4817 |      0.2786 |       0.367  |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0888 |        0.1014 |      0.0503 |       0.0626 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4832 |        0.5142 |      0.2907 |       0.3824 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.49   |        0.5103 |      0.2932 |       0.3855 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1234 |        0.1348 |      0.077  |       0.0898 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.217  |        0.2405 |      0.1314 |       0.1604 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4316 |        0.4481 |      0.2674 |       0.3404 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.108  |        0.1216 |      0.0674 |       0.0791 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1234 |        0.1348 |      0.077  |       0.0898 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0781 |        0.0829 |      0.0465 |       0.054  |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0453 |        0.0519 |      0.0305 |       0.0358 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4832 |        0.5142 |      0.2907 |       0.3824 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.2839 |        0.294  |      0.1695 |       0.22   |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2    |        0.2209 |      0.1218 |       0.163  |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.49   |        0.5103 |      0.2932 |       0.3855 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2877 |        0.289  |      0.1695 |       0.2178 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2026 |        0.2213 |      0.124  |       0.1678 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0888 |        0.1014 |      0.0503 |       0.0626 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0554 |        0.0618 |      0.0288 |       0.0372 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0334 |        0.0396 |      0.0215 |       0.0254 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4826 |        0.5093 |      0.2929 |       0.3896 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2754 |        0.2824 |      0.163  |       0.2135 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2072 |        0.2269 |      0.1299 |       0.1761 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4643 |        0.4817 |      0.2786 |       0.367  |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2656 |        0.2675 |      0.1558 |       0.2018 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1987 |        0.2142 |      0.1228 |       0.1652 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.108  |        0.1216 |      0.0674 |       0.0791 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0695 |        0.0762 |      0.0419 |       0.0488 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0385 |        0.0455 |      0.0255 |       0.0303 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.217  |        0.2405 |      0.1314 |       0.1604 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1446 |        0.1566 |      0.0897 |       0.1083 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.0723 |        0.0839 |      0.0417 |       0.052  |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4316 |        0.4481 |      0.2674 |       0.3404 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2444 |        0.2474 |      0.1485 |       0.1867 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1872 |        0.2007 |      0.1189 |       0.1536 |
