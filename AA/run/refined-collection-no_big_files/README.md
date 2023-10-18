### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4751 |        0.5042 |      0.2691 |       0.3667 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4599 |        0.474  |      0.2583 |       0.3436 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.128  |        0.1362 |      0.0667 |       0.0789 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.3704 |        0.4099 |      0.2051 |       0.2752 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5059 |        0.5222 |      0.2865 |       0.382  |
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1263 |        0.1383 |      0.0724 |       0.088  |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2775 |        0.2997 |      0.159  |       0.1952 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4538 |        0.4699 |      0.2679 |       0.3446 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1481 |        0.1624 |      0.0799 |       0.0992 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ALL-QUERIES       |       0.1263 |        0.1383 |      0.0724 |       0.088  |
| BM25 [d]     | BM25-EXTRACTED-SYN-QUERIES       |       0.0759 |        0.085  |      0.0407 |       0.0514 |
| BM25 [d]     | BM25-EXTRACTED-TREC-QUERIES      |       0.0504 |        0.0533 |      0.0317 |       0.0366 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0.3704 |        0.4099 |      0.2051 |       0.2752 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0.2265 |        0.2435 |      0.1265 |       0.1661 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0.1439 |        0.1664 |      0.0786 |       0.1091 |
| BM25 [m]     | BM25-META-ALL-QUERIES            |       0.5059 |        0.5222 |      0.2865 |       0.382  |
| BM25 [m]     | BM25-META-SYN-QUERIES            |       0.2997 |        0.2996 |      0.1679 |       0.2185 |
| BM25 [m]     | BM25-META-TREC-QUERIES           |       0.2062 |        0.2226 |      0.1186 |       0.1635 |
| TF-IDF [d]   | CS-EXTRACTED-ALL-QUERIES         |       0.128  |        0.1362 |      0.0667 |       0.0789 |
| TF-IDF [d]   | CS-EXTRACTED-SYN-QUERIES         |       0.0745 |        0.08   |      0.0389 |       0.0457 |
| TF-IDF [d]   | CS-EXTRACTED-TREC-QUERIES        |       0.0535 |        0.0562 |      0.0277 |       0.0332 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0.4751 |        0.5042 |      0.2691 |       0.3667 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0.2745 |        0.2814 |      0.1522 |       0.2025 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0.2006 |        0.2228 |      0.1168 |       0.1642 |
| TF-IDF [m]   | CS-META-ALL-QUERIES              |       0.4599 |        0.474  |      0.2583 |       0.3436 |
| TF-IDF [m]   | CS-META-SYN-QUERIES              |       0.2644 |        0.2661 |      0.1447 |       0.1891 |
| TF-IDF [m]   | CS-META-TREC-QUERIES             |       0.1955 |        0.2079 |      0.1136 |       0.1545 |
| LDM [d]      | LMD-EXTRACTED-ALL-QUERIES        |       0.1481 |        0.1624 |      0.0799 |       0.0992 |
| LDM [d]      | LMD-EXTRACTED-SYN-QUERIES        |       0.0972 |        0.1028 |      0.0503 |       0.0621 |
| LDM [d]      | LMD-EXTRACTED-TREC-QUERIES       |       0.0508 |        0.0596 |      0.0297 |       0.0371 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0.2775 |        0.2997 |      0.159  |       0.1952 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0.1764 |        0.185  |      0.1028 |       0.1236 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0.1012 |        0.1147 |      0.0562 |       0.0715 |
| LDM [m]      | LMD-META-ALL-QUERIES             |       0.4538 |        0.4699 |      0.2679 |       0.3446 |
| LDM [m]      | LMD-META-SYN-QUERIES             |       0.2599 |        0.2619 |      0.1512 |       0.1905 |
| LDM [m]      | LMD-META-TREC-QUERIES            |       0.1939 |        0.2081 |      0.1167 |       0.154  |
