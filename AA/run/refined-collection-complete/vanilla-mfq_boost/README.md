### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4647 |        0.4898 |      0.2618 |       0.3532 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4525 |        0.4706 |      0.2555 |       0.3393 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.093  |        0.0993 |      0.0492 |       0.0598 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5396 |        0.5604 |      0.3097 |       0.4142 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.498  |        0.5146 |      0.2842 |       0.3751 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1435 |        0.1457 |      0.0869 |       0.0982 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.488  |        0.51   |      0.2876 |       0.3717 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4565 |        0.4706 |      0.2697 |       0.3443 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1383 |        0.1422 |      0.0831 |       0.0946 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1435 |        0.1457 |      0.0869 |       0.0982 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0896 |        0.0897 |      0.0498 |       0.0574 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0539 |        0.0559 |      0.0371 |       0.0408 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5396 |        0.5604 |      0.3097 |       0.4142 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3186 |        0.3225 |      0.1826 |       0.2391 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.221  |        0.2379 |      0.1271 |       0.1751 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.498  |        0.5146 |      0.2842 |       0.3751 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3011 |        0.3016 |      0.172  |       0.2205 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.197  |        0.2131 |      0.1122 |       0.1548 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.093  |        0.0993 |      0.0492 |       0.0598 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0595 |        0.0647 |      0.0305 |       0.0383 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0335 |        0.0346 |      0.0187 |       0.0215 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4647 |        0.4898 |      0.2618 |       0.3532 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2649 |        0.2719 |      0.1464 |       0.1934 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.1998 |        0.2179 |      0.1154 |       0.1598 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4525 |        0.4706 |      0.2555 |       0.3393 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.268  |        0.2696 |      0.151  |       0.1938 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1845 |        0.201  |      0.1045 |       0.1455 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1383 |        0.1422 |      0.0831 |       0.0946 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0911 |        0.0924 |      0.0525 |       0.0602 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0473 |        0.0497 |      0.0306 |       0.0343 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.488  |        0.51   |      0.2876 |       0.3717 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.2886 |        0.2896 |      0.1695 |       0.2112 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.1995 |        0.2204 |      0.1181 |       0.1606 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4565 |        0.4706 |      0.2697 |       0.3443 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2633 |        0.2647 |      0.1541 |       0.1924 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1932 |        0.2059 |      0.1156 |       0.152  |
