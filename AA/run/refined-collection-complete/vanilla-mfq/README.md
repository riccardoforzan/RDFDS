### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4747 |        0.4992 |      0.2681 |       0.3635 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4599 |        0.4742 |      0.2583 |       0.344  |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0819 |        0.0937 |      0.0445 |       0.0556 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4677 |        0.4963 |      0.2644 |       0.3523 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5053 |        0.522  |      0.2862 |       0.3824 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1128 |        0.1211 |      0.0669 |       0.0777 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2179 |        0.2409 |      0.1292 |       0.1576 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4544 |        0.4699 |      0.268  |       0.3443 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.0998 |        0.1135 |      0.0591 |       0.0702 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1128 |        0.1211 |      0.0669 |       0.0777 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0708 |        0.0756 |      0.0399 |       0.0466 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.042  |        0.0455 |      0.027  |       0.0311 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4677 |        0.4963 |      0.2644 |       0.3523 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.2789 |        0.2859 |      0.1562 |       0.2023 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.1895 |        0.2108 |      0.1087 |       0.1503 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5053 |        0.522  |      0.2862 |       0.3824 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2995 |        0.2996 |      0.1678 |       0.2187 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2058 |        0.2223 |      0.1184 |       0.1637 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0819 |        0.0937 |      0.0445 |       0.0556 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.05   |        0.0574 |      0.0248 |       0.0326 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0319 |        0.0364 |      0.0197 |       0.023  |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4747 |        0.4992 |      0.2681 |       0.3635 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2726 |        0.2793 |      0.1495 |       0.2    |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2021 |        0.2199 |      0.1185 |       0.1635 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4599 |        0.4742 |      0.2583 |       0.344  |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2644 |        0.2662 |      0.1447 |       0.1893 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1955 |        0.208  |      0.1136 |       0.1547 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.0998 |        0.1135 |      0.0591 |       0.0702 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0642 |        0.0723 |      0.0369 |       0.0436 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0356 |        0.0412 |      0.0222 |       0.0266 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2179 |        0.2409 |      0.1292 |       0.1576 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1456 |        0.1545 |      0.0875 |       0.1039 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.0723 |        0.0864 |      0.0417 |       0.0538 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4544 |        0.4699 |      0.268  |       0.3443 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2605 |        0.2622 |      0.1513 |       0.1903 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1939 |        0.2077 |      0.1167 |       0.154  |
