### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4783 |        0.5047 |      0.2687 |       0.3646 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4612 |        0.4816 |      0.2616 |       0.3494 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.099  |        0.1057 |      0.0532 |       0.0646 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5391 |        0.5633 |      0.3087 |       0.4164 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5076 |        0.5242 |      0.2895 |       0.3844 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1421 |        0.1442 |      0.0856 |       0.0964 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4852 |        0.513  |      0.2882 |       0.3768 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4516 |        0.4694 |      0.2675 |       0.3451 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1347 |        0.1403 |      0.0825 |       0.0939 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1421 |        0.1442 |      0.0856 |       0.0964 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0863 |        0.0876 |      0.0476 |       0.0553 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0558 |        0.0566 |      0.038  |       0.0412 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5391 |        0.5633 |      0.3087 |       0.4164 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3168 |        0.3219 |      0.1809 |       0.2388 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2223 |        0.2414 |      0.1278 |       0.1776 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5076 |        0.5242 |      0.2895 |       0.3844 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3071 |        0.3073 |      0.1748 |       0.2257 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2005 |        0.2169 |      0.1147 |       0.1587 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.099  |        0.1057 |      0.0532 |       0.0646 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0641 |        0.0692 |      0.0337 |       0.0419 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0349 |        0.0366 |      0.0195 |       0.0226 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4783 |        0.5047 |      0.2687 |       0.3646 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2762 |        0.2798 |      0.1518 |       0.1996 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2022 |        0.2249 |      0.1169 |       0.165  |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4612 |        0.4816 |      0.2616 |       0.3494 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2771 |        0.2768 |      0.1557 |       0.1997 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.184  |        0.2048 |      0.1059 |       0.1497 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1347 |        0.1403 |      0.0825 |       0.0939 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0879 |        0.0904 |      0.0523 |       0.0596 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0468 |        0.0499 |      0.0302 |       0.0343 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4852 |        0.513  |      0.2882 |       0.3768 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.2846 |        0.2898 |      0.1682 |       0.2121 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.2007 |        0.2232 |      0.12   |       0.1647 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4516 |        0.4694 |      0.2675 |       0.3451 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2615 |        0.2649 |      0.1536 |       0.1937 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1901 |        0.2044 |      0.1138 |       0.1514 |
