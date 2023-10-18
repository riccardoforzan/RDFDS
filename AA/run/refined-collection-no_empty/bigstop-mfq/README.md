### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4843 |        0.5083 |      0.2939 |       0.3874 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4614 |        0.4792 |      0.2765 |       0.3631 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0897 |        0.1006 |      0.0516 |       0.0632 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4834 |        0.5123 |      0.2909 |       0.3815 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4871 |        0.5062 |      0.2906 |       0.3814 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1231 |        0.1345 |      0.0771 |       0.0897 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2165 |        0.2407 |      0.1315 |       0.1609 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4308 |        0.4476 |      0.2666 |       0.3397 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1096 |        0.1225 |      0.0689 |       0.0805 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1231 |        0.1345 |      0.0771 |       0.0897 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0766 |        0.0816 |      0.0462 |       0.0534 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0465 |        0.053  |      0.0309 |       0.0362 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4834 |        0.5123 |      0.2909 |       0.3815 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.2835 |        0.2934 |      0.17   |       0.2207 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2007 |        0.2197 |      0.1216 |       0.1615 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4871 |        0.5062 |      0.2906 |       0.3814 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2844 |        0.2872 |      0.1669 |       0.2154 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2027 |        0.2191 |      0.1237 |       0.166  |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0897 |        0.1006 |      0.0516 |       0.0632 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0558 |        0.0618 |      0.0298 |       0.0379 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.034  |        0.0388 |      0.0218 |       0.0253 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4843 |        0.5083 |      0.2939 |       0.3874 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2768 |        0.2822 |      0.164  |       0.2124 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2074 |        0.2261 |      0.1299 |       0.175  |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4614 |        0.4792 |      0.2765 |       0.3631 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2657 |        0.2677 |      0.1554 |       0.2008 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1957 |        0.2115 |      0.1211 |       0.1623 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1096 |        0.1225 |      0.0689 |       0.0805 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0706 |        0.0767 |      0.0433 |       0.05   |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.039  |        0.0458 |      0.0256 |       0.0305 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2165 |        0.2407 |      0.1315 |       0.1609 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1435 |        0.1553 |      0.0896 |       0.1082 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.0729 |        0.0854 |      0.0419 |       0.0527 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4308 |        0.4476 |      0.2666 |       0.3397 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2436 |        0.247  |      0.1482 |       0.1864 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1872 |        0.2006 |      0.1185 |       0.1533 |
