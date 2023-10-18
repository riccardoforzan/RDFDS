### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4752 |        0.4986 |      0.2865 |       0.3759 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4607 |        0.4768 |      0.2793 |       0.3609 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1018 |        0.1108 |      0.0573 |       0.0696 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5282 |        0.5558 |      0.3212 |       0.4266 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4946 |        0.5103 |      0.2992 |       0.3889 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1453 |        0.1508 |      0.0902 |       0.1026 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4785 |        0.5084 |      0.2989 |       0.3846 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4259 |        0.4446 |      0.2653 |       0.3366 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1397 |        0.1481 |      0.0877 |       0.1006 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1453 |        0.1508 |      0.0902 |       0.1026 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0884 |        0.0907 |      0.0498 |       0.0584 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0569 |        0.06   |      0.0404 |       0.0442 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5282 |        0.5558 |      0.3212 |       0.4266 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3085 |        0.315  |      0.1869 |       0.2437 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.22   |        0.2408 |      0.1347 |       0.183  |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4946 |        0.5103 |      0.2992 |       0.3889 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2957 |        0.2961 |      0.1775 |       0.2261 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.1989 |        0.2141 |      0.1216 |       0.1628 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1018 |        0.1108 |      0.0573 |       0.0696 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0668 |        0.0719 |      0.0371 |       0.0454 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.035  |        0.0389 |      0.0202 |       0.0242 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4752 |        0.4986 |      0.2865 |       0.3759 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2693 |        0.2751 |      0.1592 |       0.2054 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2059 |        0.2234 |      0.1273 |       0.1704 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4607 |        0.4768 |      0.2793 |       0.3609 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2704 |        0.2709 |      0.1615 |       0.2046 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1904 |        0.2059 |      0.1178 |       0.1564 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1397 |        0.1481 |      0.0877 |       0.1006 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0917 |        0.0943 |      0.055  |       0.063  |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0479 |        0.0537 |      0.0327 |       0.0376 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4785 |        0.5084 |      0.2989 |       0.3846 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.2743 |        0.2809 |      0.1701 |       0.2136 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.2042 |        0.2275 |      0.1288 |       0.171  |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4259 |        0.4446 |      0.2653 |       0.3366 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2421 |        0.2477 |      0.1489 |       0.1867 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1838 |        0.197  |      0.1163 |       0.1499 |
