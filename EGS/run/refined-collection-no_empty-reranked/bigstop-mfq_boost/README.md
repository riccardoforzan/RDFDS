### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5592 |        0.5423 |      0.3542 |       0.4269 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5407 |        0.5164 |      0.3459 |       0.4086 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1437 |        0.1343 |      0.085  |       0.0923 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.6063 |        0.5946 |      0.3827 |       0.4709 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5743 |        0.5499 |      0.3639 |       0.4365 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1707 |        0.1634 |      0.104  |       0.1135 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.546  |        0.5405 |      0.3404 |       0.4161 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5038 |        0.4841 |      0.3171 |       0.3771 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1652 |        0.1586 |      0.102  |       0.1106 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1707 |        0.1634 |      0.104  |       0.1135 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.1093 |        0.1014 |      0.0634 |       0.0691 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0614 |        0.062  |      0.0406 |       0.0444 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.6063 |        0.5946 |      0.3827 |       0.4709 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3455 |        0.3333 |      0.2146 |       0.2645 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2609 |        0.2613 |      0.1682 |       0.2065 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5743 |        0.5499 |      0.3639 |       0.4365 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3319 |        0.3135 |      0.2066 |       0.2476 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2424 |        0.2364 |      0.1574 |       0.1889 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1437 |        0.1343 |      0.085  |       0.0923 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0959 |        0.0889 |      0.0572 |       0.0621 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0479 |        0.0454 |      0.0279 |       0.0302 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5592 |        0.5423 |      0.3542 |       0.4269 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.3178 |        0.3009 |      0.1983 |       0.2357 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2414 |        0.2414 |      0.1559 |       0.1913 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5407 |        0.5164 |      0.3459 |       0.4086 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.3083 |        0.2903 |      0.1929 |       0.2277 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.2323 |        0.226  |      0.153  |       0.1809 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1652 |        0.1586 |      0.102  |       0.1106 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.1094 |        0.1011 |      0.0647 |       0.0693 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0558 |        0.0575 |      0.0373 |       0.0412 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.546  |        0.5405 |      0.3404 |       0.4161 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.3073 |        0.2973 |      0.1896 |       0.2295 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.2386 |        0.2431 |      0.1509 |       0.1865 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5038 |        0.4841 |      0.3171 |       0.3771 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2805 |        0.2657 |      0.1727 |       0.2051 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.2233 |        0.2183 |      0.1444 |       0.172  |
