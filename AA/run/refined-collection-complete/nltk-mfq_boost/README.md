### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4813 |        0.5067 |      0.2719 |       0.3686 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4658 |        0.4851 |      0.2632 |       0.3515 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0975 |        0.1048 |      0.0523 |       0.0633 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.545  |        0.5668 |      0.313  |       0.4205 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5094 |        0.5258 |      0.2898 |       0.3856 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1408 |        0.1439 |      0.0842 |       0.0954 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4906 |        0.5181 |      0.2905 |       0.3801 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4531 |        0.4698 |      0.2681 |       0.3452 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1354 |        0.1413 |      0.0821 |       0.0937 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1408 |        0.1439 |      0.0842 |       0.0954 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0864 |        0.0881 |      0.0473 |       0.0552 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0544 |        0.0558 |      0.0369 |       0.0402 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.545  |        0.5668 |      0.313  |       0.4205 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3217 |        0.3232 |      0.1846 |       0.2402 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2235 |        0.2437 |      0.1288 |       0.1805 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5094 |        0.5258 |      0.2898 |       0.3856 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.3081 |        0.3083 |      0.1743 |       0.226  |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2013 |        0.2175 |      0.1154 |       0.1596 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0975 |        0.1048 |      0.0523 |       0.0633 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0638 |        0.0683 |      0.0336 |       0.0411 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0337 |        0.0365 |      0.0187 |       0.0222 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4813 |        0.5067 |      0.2719 |       0.3686 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2754 |        0.2807 |      0.1522 |       0.2014 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.206  |        0.2261 |      0.1196 |       0.1673 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4658 |        0.4851 |      0.2632 |       0.3515 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2779 |        0.2769 |      0.1566 |       0.2003 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1879 |        0.2082 |      0.1066 |       0.1512 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1354 |        0.1413 |      0.0821 |       0.0937 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0896 |        0.0917 |      0.0524 |       0.0597 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0457 |        0.0496 |      0.0296 |       0.0339 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4906 |        0.5181 |      0.2905 |       0.3801 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.2869 |        0.2915 |      0.1686 |       0.2129 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.2036 |        0.226  |      0.1219 |       0.167  |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4531 |        0.4698 |      0.2681 |       0.3452 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2622 |        0.2648 |      0.1539 |       0.1933 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1909 |        0.205  |      0.1142 |       0.1518 |
