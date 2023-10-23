### ALL QUERIES

|PAPER RUN NAME  | RUN NAME                               |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|----------------|:---------------------------------------|-------------:|--------------:|------------:|-------------:|
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES          |       0.4424 |        0.4474 |      0.2622 |       0.335  |
| TF-IDF + N     | CS-META+EXTRACTED+NODES-ALL-QUERIES    |       0.4399 |        0.4487 |      0.2598 |       0.3355 |
| TF-IDF [m]     | CS-META-ALL-QUERIES                    |       0.4212 |        0.4244 |      0.2472 |       0.3162 |
| TF-IDF [m] + N | CS-META+NODES-ALL-QUERIES              |       0.4251 |        0.4273 |      0.2488 |       0.3194 |
| TF-IDF [d]     | CS-EXTRACTED-ALL-QUERIES               |       0.0776 |        0.086  |      0.0447 |       0.0535 |
| TF-IDF N       | CS-NODES-ALL-QUERIES                   |       0.0811 |        0.0781 |      0.0364 |       0.0411 |
| TF-IDF [d] + N | CS-EXTRACTED+NODES-ALL-QUERIES         |       0.1037 |        0.1089 |      0.0529 |       0.0621 |
| BM25           | BM25-META+EXTRACTED-ALL-QUERIES        |       0.4392 |        0.4649 |      0.2578 |       0.3388 |
| BM25 + N       | BM25-META+EXTRACTED+NODES-ALL-QUERIES  |       0.4144 |        0.4389 |      0.2402 |       0.3122 |
| BM25 [m]       | BM25-META-ALL-QUERIES                  |       0.4495 |        0.4547 |      0.2649 |       0.3371 |
| BM25 [m] + N   | BM25-META+NODES-ALL-QUERIES            |       0.4319 |        0.4457 |      0.2474 |       0.3239 |
| BM25 [d]       | BM25-EXTRACTED-ALL-QUERIES             |       0.1066 |        0.112  |      0.0649 |       0.073  |
| BM25 N         | BM25-NODES-ALL-QUERIES                 |       0.0798 |        0.0784 |      0.0351 |       0.0405 |
| BM25 [d] + N   | BM25-EXTRACTED+NODES-ALL-QUERIES       |       0.1306 |        0.1386 |      0.0722 |       0.0842 |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES         |       0.1862 |        0.2064 |      0.109  |       0.1336 |
| LMD + N        | LMD-META+EXTRACTED+NODES-ALL-QUERIES   |       0.2031 |        0.2218 |      0.1169 |       0.1425 |
| LMD [m]        | LMD-META-ALL-QUERIES                   |       0.3877 |        0.3919 |      0.2332 |       0.2883 |
| LMD [m] + N    | LMD-META+NODES-ALL-QUERIES             |       0.3686 |        0.3776 |      0.2151 |       0.2697 |
| LMD [d]        | LMD-EXTRACTED-ALL-QUERIES              |       0.0911 |        0.1014 |      0.0575 |       0.0662 |
| LMD N          | LMD-NODES-ALL-QUERIES                  |       0.0834 |        0.0821 |      0.0371 |       0.0432 |
| LMD [d] + N    | LMD-EXTRACTED+NODES-ALL-QUERIES        |       0.1095 |        0.1184 |      0.064  |       0.074  |

### RESULTS

|PAPER RUN NAME  | RUN NAME                               |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|----------------|:---------------------------------------|-------------:|--------------:|------------:|-------------:|
| BM25 [d] + N   | BM25-EXTRACTED+NODES-ALL-QUERIES       |       0.1306 |        0.1386 |      0.0722 |       0.0842 |
| BM25 [d] + N   | BM25-EXTRACTED+NODES-SYN-QUERIES       |       0.0749 |        0.0763 |      0.0396 |       0.0461 |
| BM25 [d] + N   | BM25-EXTRACTED+NODES-TREC-QUERIES      |       0.0557 |        0.0623 |      0.0326 |       0.0381 |
| BM25 [d]       | BM25-EXTRACTED-ALL-QUERIES             |       0.1066 |        0.112  |      0.0649 |       0.073  |
| BM25 [d]       | BM25-EXTRACTED-SYN-QUERIES             |       0.0639 |        0.0649 |      0.0369 |       0.0414 |
| BM25 [d]       | BM25-EXTRACTED-TREC-QUERIES            |       0.0427 |        0.0472 |      0.0279 |       0.0316 |
| BM25 + N       | BM25-META+EXTRACTED+NODES-ALL-QUERIES  |       0.4144 |        0.4389 |      0.2402 |       0.3122 |
| BM25 + N       | BM25-META+EXTRACTED+NODES-SYN-QUERIES  |       0.2263 |        0.2351 |      0.1283 |       0.1677 |
| BM25 + N       | BM25-META+EXTRACTED+NODES-TREC-QUERIES |       0.1887 |        0.2045 |      0.1125 |       0.1452 |
| BM25           | BM25-META+EXTRACTED-ALL-QUERIES        |       0.4392 |        0.4649 |      0.2578 |       0.3388 |
| BM25           | BM25-META+EXTRACTED-SYN-QUERIES        |       0.241  |        0.2476 |      0.1381 |       0.1805 |
| BM25           | BM25-META+EXTRACTED-TREC-QUERIES       |       0.1988 |        0.218  |      0.1203 |       0.159  |
| BM25 [m] + N   | BM25-META+NODES-ALL-QUERIES            |       0.4319 |        0.4457 |      0.2474 |       0.3239 |
| BM25 [m] + N   | BM25-META+NODES-SYN-QUERIES            |       0.2414 |        0.2403 |      0.1336 |       0.1736 |
| BM25 [m] + N   | BM25-META+NODES-TREC-QUERIES           |       0.1905 |        0.2054 |      0.1137 |       0.1504 |
| BM25 [m]       | BM25-META-ALL-QUERIES                  |       0.4495 |        0.4547 |      0.2649 |       0.3371 |
| BM25 [m]       | BM25-META-SYN-QUERIES                  |       0.2461 |        0.2432 |      0.1389 |       0.1775 |
| BM25 [m]       | BM25-META-TREC-QUERIES                 |       0.2036 |        0.2116 |      0.1263 |       0.1597 |
| BM25 N         | BM25-NODES-ALL-QUERIES                 |       0.0798 |        0.0784 |      0.0351 |       0.0405 |
| BM25 N         | BM25-NODES-SYN-QUERIES                 |       0.0451 |        0.0451 |      0.0211 |       0.0246 |
| BM25 N         | BM25-NODES-TREC-QUERIES                |       0.0347 |        0.0333 |      0.014  |       0.0159 |
| TF-IDF [d] + N | CS-EXTRACTED+NODES-ALL-QUERIES         |       0.1037 |        0.1089 |      0.0529 |       0.0621 |
| TF-IDF [d] + N | CS-EXTRACTED+NODES-SYN-QUERIES         |       0.0559 |        0.0572 |      0.0271 |       0.0323 |
| TF-IDF [d] + N | CS-EXTRACTED+NODES-TREC-QUERIES        |       0.0479 |        0.0517 |      0.0258 |       0.0298 |
| TF-IDF [d]     | CS-EXTRACTED-ALL-QUERIES               |       0.0776 |        0.086  |      0.0447 |       0.0535 |
| TF-IDF [d]     | CS-EXTRACTED-SYN-QUERIES               |       0.045  |        0.047  |      0.0244 |       0.0289 |
| TF-IDF [d]     | CS-EXTRACTED-TREC-QUERIES              |       0.0326 |        0.039  |      0.0204 |       0.0245 |
| TF-IDF + N     | CS-META+EXTRACTED+NODES-ALL-QUERIES    |       0.4399 |        0.4487 |      0.2598 |       0.3355 |
| TF-IDF + N     | CS-META+EXTRACTED+NODES-SYN-QUERIES    |       0.2375 |        0.2357 |      0.1333 |       0.1727 |
| TF-IDF + N     | CS-META+EXTRACTED+NODES-TREC-QUERIES   |       0.2024 |        0.213  |      0.1265 |       0.1628 |
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES          |       0.4424 |        0.4474 |      0.2622 |       0.335  |
| TF-IDF         | CS-META+EXTRACTED-SYN-QUERIES          |       0.2381 |        0.234  |      0.1337 |       0.1706 |
| TF-IDF         | CS-META+EXTRACTED-TREC-QUERIES         |       0.2043 |        0.2134 |      0.1284 |       0.1644 |
| TF-IDF [m] + N | CS-META+NODES-ALL-QUERIES              |       0.4251 |        0.4273 |      0.2488 |       0.3194 |
| TF-IDF [m] + N | CS-META+NODES-SYN-QUERIES              |       0.2302 |        0.2263 |      0.1271 |       0.1646 |
| TF-IDF [m] + N | CS-META+NODES-TREC-QUERIES             |       0.1949 |        0.201  |      0.1217 |       0.1548 |
| TF-IDF [m]     | CS-META-ALL-QUERIES                    |       0.4212 |        0.4244 |      0.2472 |       0.3162 |
| TF-IDF [m]     | CS-META-SYN-QUERIES                    |       0.2262 |        0.2231 |      0.1248 |       0.1611 |
| TF-IDF [m]     | CS-META-TREC-QUERIES                   |       0.195  |        0.2012 |      0.1225 |       0.1551 |
| TF-IDF N       | CS-NODES-ALL-QUERIES                   |       0.0811 |        0.0781 |      0.0364 |       0.0411 |
| TF-IDF N       | CS-NODES-SYN-QUERIES                   |       0.046  |        0.0452 |      0.0218 |       0.025  |
| TF-IDF N       | CS-NODES-TREC-QUERIES                  |       0.0351 |        0.0329 |      0.0145 |       0.0162 |
| LMD [d] + N    | LMD-EXTRACTED+NODES-ALL-QUERIES        |       0.1095 |        0.1184 |      0.064  |       0.074  |
| LMD [d] + N    | LMD-EXTRACTED+NODES-SYN-QUERIES        |       0.0683 |        0.0713 |      0.0396 |       0.0449 |
| LMD [d] + N    | LMD-EXTRACTED+NODES-TREC-QUERIES       |       0.0412 |        0.0472 |      0.0244 |       0.0291 |
| LMD [d]        | LMD-EXTRACTED-ALL-QUERIES              |       0.0911 |        0.1014 |      0.0575 |       0.0662 |
| LMD [d]        | LMD-EXTRACTED-SYN-QUERIES              |       0.0559 |        0.0598 |      0.0345 |       0.0387 |
| LMD [d]        | LMD-EXTRACTED-TREC-QUERIES             |       0.0351 |        0.0416 |      0.023  |       0.0274 |
| LMD + N        | LMD-META+EXTRACTED+NODES-ALL-QUERIES   |       0.2031 |        0.2218 |      0.1169 |       0.1425 |
| LMD + N        | LMD-META+EXTRACTED+NODES-SYN-QUERIES   |       0.1235 |        0.13   |      0.0739 |       0.088  |
| LMD + N        | LMD-META+EXTRACTED+NODES-TREC-QUERIES  |       0.0796 |        0.0918 |      0.043  |       0.0546 |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES         |       0.1862 |        0.2064 |      0.109  |       0.1336 |
| LMD            | LMD-META+EXTRACTED-SYN-QUERIES         |       0.1182 |        0.1266 |      0.0714 |       0.0858 |
| LMD            | LMD-META+EXTRACTED-TREC-QUERIES        |       0.068  |        0.0798 |      0.0377 |       0.0478 |
| LMD [m] + N    | LMD-META+NODES-ALL-QUERIES             |       0.3686 |        0.3776 |      0.2151 |       0.2697 |
| LMD [m] + N    | LMD-META+NODES-SYN-QUERIES             |       0.1974 |        0.1965 |      0.1103 |       0.1387 |
| LMD [m] + N    | LMD-META+NODES-TREC-QUERIES            |       0.1712 |        0.1814 |      0.1048 |       0.1312 |
| LMD [m]        | LMD-META-ALL-QUERIES                   |       0.3877 |        0.3919 |      0.2332 |       0.2883 |
| LMD [m]        | LMD-META-SYN-QUERIES                   |       0.2074 |        0.2035 |      0.119  |       0.1469 |
| LMD [m]        | LMD-META-TREC-QUERIES                  |       0.1803 |        0.1884 |      0.1142 |       0.1414 |
| LMD N          | LMD-NODES-ALL-QUERIES                  |       0.0834 |        0.0821 |      0.0371 |       0.0432 |
| LMD N          | LMD-NODES-SYN-QUERIES                  |       0.047  |        0.047  |      0.0215 |       0.0256 |
| LMD N          | LMD-NODES-TREC-QUERIES                 |       0.0364 |        0.0351 |      0.0156 |       0.0175 |