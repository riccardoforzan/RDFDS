### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5432 |        0.528  |      0.3419 |       0.4146 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5206 |        0.4987 |      0.3254 |       0.39   |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1224 |        0.1167 |      0.0707 |       0.0773 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5324 |        0.5277 |      0.3262 |       0.4019 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5624 |        0.5455 |      0.3508 |       0.427  |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1365 |        0.1345 |      0.0814 |       0.0897 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2636 |        0.2647 |      0.1589 |       0.1826 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5056 |        0.4847 |      0.3175 |       0.3765 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1332 |        0.1333 |      0.0812 |       0.0892 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1365 |        0.1345 |      0.0814 |       0.0897 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0864 |        0.0837 |      0.0491 |       0.0544 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0501 |        0.0508 |      0.0323 |       0.0353 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5324 |        0.5277 |      0.3262 |       0.4019 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3059 |        0.2983 |      0.1843 |       0.2264 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2264 |        0.2295 |      0.142  |       0.1755 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5624 |        0.5455 |      0.3508 |       0.427  |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3191 |        0.3047 |      0.197  |       0.2391 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2433 |        0.2408 |      0.1537 |       0.1879 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1224 |        0.1167 |      0.0707 |       0.0773 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0812 |        0.076  |      0.0474 |       0.0515 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0411 |        0.0407 |      0.0233 |       0.0257 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5432 |        0.528  |      0.3419 |       0.4146 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.3122 |        0.2986 |      0.1952 |       0.2347 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.231  |        0.2295 |      0.1467 |       0.18   |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5206 |        0.4987 |      0.3254 |       0.39   |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2986 |        0.2811 |      0.1838 |       0.2183 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.222  |        0.2176 |      0.1416 |       0.1717 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1332 |        0.1333 |      0.0812 |       0.0892 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0878 |        0.0851 |      0.0516 |       0.0562 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0454 |        0.0482 |      0.0296 |       0.0331 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2636 |        0.2647 |      0.1589 |       0.1826 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1738 |        0.1702 |      0.1075 |       0.1217 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.0898 |        0.0944 |      0.0515 |       0.0609 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5056 |        0.4847 |      0.3175 |       0.3765 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2799 |        0.2636 |      0.1704 |       0.2021 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.2257 |        0.2211 |      0.1471 |       0.1744 |
