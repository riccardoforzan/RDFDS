### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4899 |        0.518  |      0.2786 |       0.3792 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4708 |        0.4947 |      0.2643 |       0.3603 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0859 |        0.0947 |      0.0463 |       0.0566 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4932 |        0.5199 |      0.2803 |       0.3733 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5076 |        0.5249 |      0.2872 |       0.3847 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1198 |        0.1287 |      0.0727 |       0.0836 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2162 |        0.2356 |      0.1264 |       0.1528 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4552 |        0.4707 |      0.2689 |       0.3469 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1065 |        0.1172 |      0.0648 |       0.0752 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1198 |        0.1287 |      0.0727 |       0.0836 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0749 |        0.0792 |      0.0435 |       0.05   |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.045  |        0.0496 |      0.0292 |       0.0336 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4932 |        0.5199 |      0.2803 |       0.3733 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.2909 |        0.2996 |      0.1644 |       0.2157 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.203  |        0.2211 |      0.1166 |       0.1582 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5076 |        0.5249 |      0.2872 |       0.3847 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2995 |        0.2996 |      0.167  |       0.2181 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2081 |        0.2253 |      0.1202 |       0.1667 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.0859 |        0.0947 |      0.0463 |       0.0566 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0531 |        0.0585 |      0.0265 |       0.0337 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0328 |        0.0362 |      0.0198 |       0.0229 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4899 |        0.518  |      0.2786 |       0.3792 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.283  |        0.2889 |      0.1573 |       0.2084 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2069 |        0.229  |      0.1213 |       0.1709 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4708 |        0.4947 |      0.2643 |       0.3603 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.273  |        0.2773 |      0.1493 |       0.1992 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1978 |        0.2174 |      0.115  |       0.1611 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1065 |        0.1172 |      0.0648 |       0.0752 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0688 |        0.0743 |      0.0408 |       0.047  |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0376 |        0.0429 |      0.024  |       0.0282 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2162 |        0.2356 |      0.1264 |       0.1528 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1422 |        0.1507 |      0.0839 |       0.1    |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.074  |        0.0849 |      0.0425 |       0.0529 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4552 |        0.4707 |      0.2689 |       0.3469 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2601 |        0.2616 |      0.151  |       0.1908 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1951 |        0.2091 |      0.1179 |       0.1561 |
