### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5579 |        0.5476 |      0.3535 |       0.4344 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5334 |        0.5166 |      0.3354 |       0.4092 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1228 |        0.1184 |      0.071  |       0.0785 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5581 |        0.556  |      0.3465 |       0.4265 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5728 |        0.5544 |      0.3587 |       0.4353 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1443 |        0.1418 |      0.0857 |       0.0946 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.262  |        0.2629 |      0.1576 |       0.1806 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5052 |        0.4856 |      0.318  |       0.3787 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1337 |        0.1328 |      0.0822 |       0.0903 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1443 |        0.1418 |      0.0857 |       0.0946 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0933 |        0.0885 |      0.0531 |       0.0583 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0511 |        0.0533 |      0.0326 |       0.0363 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5581 |        0.556  |      0.3465 |       0.4265 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3176 |        0.3125 |      0.1943 |       0.2387 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2405 |        0.2434 |      0.1522 |       0.1878 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5728 |        0.5544 |      0.3587 |       0.4353 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3243 |        0.308  |      0.2    |       0.241  |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2485 |        0.2464 |      0.1587 |       0.1943 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1228 |        0.1184 |      0.071  |       0.0785 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0813 |        0.0764 |      0.0474 |       0.052  |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0415 |        0.042  |      0.0236 |       0.0265 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5579 |        0.5476 |      0.3535 |       0.4344 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.3175 |        0.3056 |      0.1975 |       0.2407 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2405 |        0.242  |      0.1559 |       0.1937 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5334 |        0.5166 |      0.3354 |       0.4092 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.3012 |        0.2861 |      0.1853 |       0.2245 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.2323 |        0.2305 |      0.1501 |       0.1847 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1337 |        0.1328 |      0.0822 |       0.0903 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0864 |        0.0836 |      0.0515 |       0.0561 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0473 |        0.0492 |      0.0307 |       0.0341 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.262  |        0.2629 |      0.1576 |       0.1806 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1768 |        0.1728 |      0.1093 |       0.1236 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.0852 |        0.0902 |      0.0482 |       0.057  |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5052 |        0.4856 |      0.318  |       0.3787 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2764 |        0.2617 |      0.1693 |       0.2019 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.2287 |        0.2239 |      0.1487 |       0.1767 |
