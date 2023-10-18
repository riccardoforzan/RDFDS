### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4548 |        0.4787 |      0.2721 |       0.3574 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4474 |        0.4662 |      0.2705 |       0.35   |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0973 |        0.105  |      0.0538 |       0.0657 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5201 |        0.5463 |      0.3166 |       0.4173 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4828 |        0.4986 |      0.2922 |       0.3774 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1478 |        0.1525 |      0.0926 |       0.1052 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4738 |        0.501  |      0.293  |       0.3753 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4288 |        0.444  |      0.2666 |       0.335  |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1425 |        0.1488 |      0.0888 |       0.1015 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1478 |        0.1525 |      0.0926 |       0.1052 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0915 |        0.0923 |      0.0523 |       0.0606 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0562 |        0.0602 |      0.0403 |       0.0447 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.5201 |        0.5463 |      0.3166 |       0.4173 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.3058 |        0.3139 |      0.1855 |       0.2424 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.2143 |        0.2324 |      0.1311 |       0.175  |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4828 |        0.4986 |      0.2922 |       0.3774 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2909 |        0.2912 |      0.1755 |       0.2221 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.1919 |        0.2075 |      0.1166 |       0.1555 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0973 |        0.105  |      0.0538 |       0.0657 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0626 |        0.0684 |      0.0338 |       0.0424 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0346 |        0.0366 |      0.02   |       0.0232 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4548 |        0.4787 |      0.2721 |       0.3574 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2556 |        0.2644 |      0.149  |       0.1946 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.1992 |        0.2143 |      0.1231 |       0.1628 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4474 |        0.4662 |      0.2705 |       0.35   |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2612 |        0.2668 |      0.1556 |       0.1992 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1863 |        0.1994 |      0.1149 |       0.1507 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1425 |        0.1488 |      0.0888 |       0.1015 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0931 |        0.095  |      0.0551 |       0.0635 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0495 |        0.0538 |      0.0337 |       0.038  |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.4738 |        0.501  |      0.293  |       0.3753 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.2748 |        0.2798 |      0.1691 |       0.2113 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.199  |        0.2212 |      0.1239 |       0.1641 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4288 |        0.444  |      0.2666 |       0.335  |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2429 |        0.2468 |      0.1487 |       0.1852 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1858 |        0.1972 |      0.1179 |       0.1498 |
