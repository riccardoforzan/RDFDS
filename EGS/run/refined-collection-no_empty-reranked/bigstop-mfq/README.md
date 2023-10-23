### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5601 |        0.5481 |      0.3536 |       0.4328 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5357 |        0.5175 |      0.3374 |       0.4091 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1223 |        0.1167 |      0.0706 |       0.078  |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5588 |        0.5529 |      0.3461 |       0.4244 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5689 |        0.55   |      0.3562 |       0.4315 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1449 |        0.1421 |      0.0855 |       0.0942 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2612 |        0.2617 |      0.156  |       0.1791 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5036 |        0.4847 |      0.3163 |       0.3773 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1342 |        0.1328 |      0.0821 |       0.0901 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1449 |        0.1421 |      0.0855 |       0.0942 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0923 |        0.0877 |      0.0528 |       0.0577 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0526 |        0.0544 |      0.0328 |       0.0365 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5588 |        0.5529 |      0.3461 |       0.4244 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3181 |        0.3119 |      0.1946 |       0.2392 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2407 |        0.241  |      0.1515 |       0.1852 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5689 |        0.55   |      0.3562 |       0.4315 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3235 |        0.307  |      0.1994 |       0.2398 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2453 |        0.243  |      0.1568 |       0.1918 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1223 |        0.1167 |      0.0706 |       0.078  |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0809 |        0.0759 |      0.0472 |       0.0519 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0414 |        0.0408 |      0.0234 |       0.026  |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5601 |        0.5481 |      0.3536 |       0.4328 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.3173 |        0.3054 |      0.1964 |       0.2388 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2428 |        0.2427 |      0.1572 |       0.194  |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5357 |        0.5175 |      0.3374 |       0.4091 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.3035 |        0.2882 |      0.187  |       0.2258 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.2322 |        0.2293 |      0.1504 |       0.1833 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1342 |        0.1328 |      0.0821 |       0.0901 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0864 |        0.0831 |      0.0513 |       0.0558 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0478 |        0.0498 |      0.0308 |       0.0343 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2612 |        0.2617 |      0.156  |       0.1791 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1734 |        0.1697 |      0.1066 |       0.1212 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.0878 |        0.0919 |      0.0494 |       0.0579 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5036 |        0.4847 |      0.3163 |       0.3773 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2762 |        0.2615 |      0.1691 |       0.2018 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.2274 |        0.2231 |      0.1471 |       0.1755 |
