### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4632 |        0.489  |      0.2772 |       0.3679 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4482 |        0.4615 |      0.2674 |       0.3462 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.085  |        0.0991 |      0.049  |       0.0614 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4591 |        0.491  |      0.2757 |       0.3633 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4825 |        0.503  |      0.2872 |       0.3782 |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.116  |        0.1268 |      0.0713 |       0.0836 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2186 |        0.2445 |      0.1351 |       0.165  |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4323 |        0.4469 |      0.2678 |       0.3382 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1022 |        0.1188 |      0.0624 |       0.0752 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.116  |        0.1268 |      0.0713 |       0.0836 |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0724 |        0.078  |      0.0426 |       0.05   |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0436 |        0.0487 |      0.0287 |       0.0336 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.4591 |        0.491  |      0.2757 |       0.3633 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.2713 |        0.2812 |      0.162  |       0.2091 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.1885 |        0.2102 |      0.1142 |       0.1545 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.4825 |        0.503  |      0.2872 |       0.3782 |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2827 |        0.285  |      0.1652 |       0.2143 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.1998 |        0.218  |      0.122  |       0.1639 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.085  |        0.0991 |      0.049  |       0.0614 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0524 |        0.0606 |      0.0279 |       0.0366 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0326 |        0.0384 |      0.0211 |       0.0248 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4632 |        0.489  |      0.2772 |       0.3679 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2647 |        0.2745 |      0.1545 |       0.2044 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.1985 |        0.2145 |      0.1227 |       0.1635 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4482 |        0.4615 |      0.2674 |       0.3462 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.256  |        0.2586 |      0.149  |       0.191  |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1922 |        0.2029 |      0.1185 |       0.1551 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1022 |        0.1188 |      0.0624 |       0.0752 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0658 |        0.0747 |      0.0389 |       0.0465 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0364 |        0.044  |      0.0234 |       0.0287 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2186 |        0.2445 |      0.1351 |       0.165  |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1477 |        0.157  |      0.0934 |       0.1102 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.0709 |        0.0874 |      0.0417 |       0.0548 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4323 |        0.4469 |      0.2678 |       0.3382 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2455 |        0.2475 |      0.1488 |       0.1859 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1868 |        0.1995 |      0.119  |       0.1523 |
