### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5389 |        0.5199 |      0.3388 |       0.4061 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5361 |        0.51   |      0.3402 |       0.4013 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1383 |        0.1275 |      0.0806 |       0.0868 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5978 |        0.5876 |      0.3768 |       0.4631 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5649 |        0.5414 |      0.3553 |       0.4263 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1691 |        0.1613 |      0.1025 |       0.1114 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.5401 |        0.5353 |      0.3336 |       0.4079 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5031 |        0.4835 |      0.3142 |       0.3732 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1669 |        0.1607 |      0.1024 |       0.1117 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1691 |        0.1613 |      0.1025 |       0.1114 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.1074 |        0.0998 |      0.0614 |       0.0671 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0618 |        0.0615 |      0.0411 |       0.0443 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5978 |        0.5876 |      0.3768 |       0.4631 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3454 |        0.3337 |      0.2158 |       0.265  |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2524 |        0.2539 |      0.161  |       0.1982 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5649 |        0.5414 |      0.3553 |       0.4263 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3277 |        0.3099 |      0.2049 |       0.2448 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2375 |        0.2317 |      0.151  |       0.182  |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.1383 |        0.1275 |      0.0806 |       0.0868 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0941 |        0.0855 |      0.0549 |       0.0589 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0442 |        0.042  |      0.0257 |       0.0279 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.5389 |        0.5199 |      0.3388 |       0.4061 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.3077 |        0.2909 |      0.192  |       0.2272 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2312 |        0.2289 |      0.1469 |       0.1789 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.5361 |        0.51   |      0.3402 |       0.4013 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.3073 |        0.2894 |      0.1921 |       0.2267 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.2288 |        0.2206 |      0.1481 |       0.1746 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1669 |        0.1607 |      0.1024 |       0.1117 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.1107 |        0.1033 |      0.0646 |       0.0705 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0563 |        0.0575 |      0.0377 |       0.0412 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.5401 |        0.5353 |      0.3336 |       0.4079 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.3062 |        0.2964 |      0.1875 |       0.2272 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.2339 |        0.2389 |      0.1461 |       0.1808 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.5031 |        0.4835 |      0.3142 |       0.3732 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2819 |        0.2662 |      0.1725 |       0.2034 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.2212 |        0.2173 |      0.1417 |       0.1697 |
