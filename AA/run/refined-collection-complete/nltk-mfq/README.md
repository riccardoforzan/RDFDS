### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4873 |        0.517  |      0.2763 |       0.3799 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4717 |        0.4929 |      0.2649 |       0.3615 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0851 |        0.0955 |      0.0451 |       0.0561 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.494  |        0.5213 |      0.2804 |       0.3741 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5108 |        0.5305 |      0.2913 |       0.3902 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.12   |        0.129  |      0.0725 |       0.0837 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2167 |        0.2366 |      0.1268 |       0.154  |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4552 |        0.4715 |      0.2694 |       0.3475 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1043 |        0.1161 |      0.063  |       0.0736 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.12   |        0.129  |      0.0725 |       0.0837 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0764 |        0.0805 |      0.0438 |       0.0506 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0436 |        0.0486 |      0.0287 |       0.0331 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.494  |        0.5213 |      0.2804 |       0.3741 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.2916 |        0.3    |      0.1641 |       0.2151 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.203  |        0.2219 |      0.1169 |       0.1595 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5108 |        0.5305 |      0.2913 |       0.3902 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3011 |        0.3019 |      0.1692 |       0.2204 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2097 |        0.2286 |      0.1221 |       0.1698 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0851 |        0.0955 |      0.0451 |       0.0561 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0528 |        0.0585 |      0.0256 |       0.0331 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0323 |        0.037  |      0.0195 |       0.023  |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4873 |        0.517  |      0.2763 |       0.3799 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2817 |        0.2886 |      0.1562 |       0.209  |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2056 |        0.2284 |      0.12   |       0.1709 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4717 |        0.4929 |      0.2649 |       0.3615 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2715 |        0.2754 |      0.1491 |       0.1993 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.2002 |        0.2175 |      0.1158 |       0.1622 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1043 |        0.1161 |      0.063  |       0.0736 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0678 |        0.0737 |      0.0395 |       0.0457 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0365 |        0.0424 |      0.0235 |       0.0279 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2167 |        0.2366 |      0.1268 |       0.154  |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1438 |        0.1518 |      0.0847 |       0.1007 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.0729 |        0.0848 |      0.0421 |       0.0533 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4552 |        0.4715 |      0.2694 |       0.3475 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2604 |        0.2618 |      0.1515 |       0.191  |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1948 |        0.2097 |      0.118  |       0.1565 |
