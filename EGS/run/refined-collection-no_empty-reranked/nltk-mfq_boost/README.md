### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5575 |        0.5416 |      0.3541 |       0.428  |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5464 |        0.5204 |      0.3481 |       0.4122 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1418 |        0.1325 |      0.0826 |       0.0898 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.6133 |        0.602  |      0.3897 |       0.4788 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5775 |        0.5539 |      0.3665 |       0.4399 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1712 |        0.1643 |      0.1052 |       0.1145 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.5495 |        0.5445 |      0.3428 |       0.4194 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5051 |        0.4851 |      0.3172 |       0.3768 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.166  |        0.1598 |      0.1019 |       0.111  |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1712 |        0.1643 |      0.1052 |       0.1145 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.1092 |        0.1017 |      0.0636 |       0.0693 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0619 |        0.0626 |      0.0416 |       0.0452 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.6133 |        0.602  |      0.3897 |       0.4788 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3486 |        0.3355 |      0.2176 |       0.2664 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2647 |        0.2665 |      0.1721 |       0.2124 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5775 |        0.5539 |      0.3665 |       0.4399 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3333 |        0.3157 |      0.2085 |       0.2503 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2442 |        0.2382 |      0.1582 |       0.1899 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1418 |        0.1325 |      0.0826 |       0.0898 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0939 |        0.0868 |      0.0549 |       0.0598 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.048  |        0.0457 |      0.0277 |       0.03   |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5575 |        0.5416 |      0.3541 |       0.428  |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.3167 |        0.3001 |      0.1982 |       0.2359 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2408 |        0.2415 |      0.1559 |       0.1921 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5464 |        0.5204 |      0.3481 |       0.4122 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.3098 |        0.2924 |      0.1942 |       0.2305 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.2366 |        0.2281 |      0.1539 |       0.1817 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.166  |        0.1598 |      0.1019 |       0.111  |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.1102 |        0.102  |      0.0646 |       0.0697 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0558 |        0.0578 |      0.0373 |       0.0413 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.5495 |        0.5445 |      0.3428 |       0.4194 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.3084 |        0.298  |      0.1899 |       0.2295 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.2411 |        0.2466 |      0.1529 |       0.1898 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5051 |        0.4851 |      0.3172 |       0.3768 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2806 |        0.2653 |      0.1718 |       0.2037 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.2246 |        0.2197 |      0.1454 |       0.1731 |
