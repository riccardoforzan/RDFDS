### ALL QUERIES

|PAPER RUN NAME  | RUN NAME                               |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|----------------|:---------------------------------------|-------------:|--------------:|------------:|-------------:|
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES          |       0.4474 |        0.4648 |      0.2865 |       0.3608 |
| TF-IDF + N     | CS-META+EXTRACTED+NODES-ALL-QUERIES    |       0.4475 |        0.4708 |      0.2868 |       0.3668 |
| TF-IDF [m]     | CS-META-ALL-QUERIES                    |       0.4247 |        0.4363 |      0.2681 |       0.3371 |
| TF-IDF [m] + N | CS-META+NODES-ALL-QUERIES              |       0.4296 |        0.4447 |      0.2722 |       0.3451 |
| TF-IDF [d]     | CS-EXTRACTED-ALL-QUERIES               |       0.078  |        0.0878 |      0.0483 |       0.0572 |
| TF-IDF N       | CS-NODES-ALL-QUERIES                   |       0.0849 |        0.0826 |      0.0417 |       0.0459 |
| TF-IDF [d] + N | CS-EXTRACTED+NODES-ALL-QUERIES         |       0.1048 |        0.1129 |      0.0564 |       0.0667 |
| BM25           | BM25-META+EXTRACTED-ALL-QUERIES        |       0.4387 |        0.4749 |      0.2805 |       0.3633 |
| BM25 + N       | BM25-META+EXTRACTED+NODES-ALL-QUERIES  |       0.4095 |        0.4446 |      0.2563 |       0.33   |
| BM25 [m]       | BM25-META-ALL-QUERIES                  |       0.4616 |        0.4808 |      0.2961 |       0.3761 |
| BM25 [m] + N   | BM25-META+NODES-ALL-QUERIES            |       0.439  |        0.4685 |      0.273  |       0.3576 |
| BM25 [d]       | BM25-EXTRACTED-ALL-QUERIES             |       0.1056 |        0.1158 |      0.0653 |       0.0759 |
| BM25 N         | BM25-NODES-ALL-QUERIES                 |       0.0825 |        0.084  |      0.0401 |       0.046  |
| BM25 [d] + N   | BM25-EXTRACTED+NODES-ALL-QUERIES       |       0.1275 |        0.1413 |      0.0751 |       0.0891 |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES         |       0.2005 |        0.2272 |      0.126  |       0.153  |
| LMD + N        | LMD-META+EXTRACTED+NODES-ALL-QUERIES   |       0.2119 |        0.2363 |      0.1284 |       0.1572 |
| LMD [m]        | LMD-META-ALL-QUERIES                   |       0.4102 |        0.4269 |      0.2702 |       0.3322 |
| LMD [m] + N    | LMD-META+NODES-ALL-QUERIES             |       0.3913 |        0.4107 |      0.2517 |       0.3113 |
| LMD [d]        | LMD-EXTRACTED-ALL-QUERIES              |       0.0942 |        0.1091 |      0.0601 |       0.071  |
| LMD N          | LMD-NODES-ALL-QUERIES                  |       0.0857 |        0.0868 |      0.0426 |       0.0487 |
| LMD [d] + N    | LMD-EXTRACTED+NODES-ALL-QUERIES        |       0.1125 |        0.126  |      0.0671 |       0.0796 |

### RESULTS

|PAPER RUN NAME  | RUN NAME                               |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|----------------|:---------------------------------------|-------------:|--------------:|------------:|-------------:|
| BM25 [d] + N   | BM25-EXTRACTED+NODES-ALL-QUERIES       |       0.1275 |        0.1413 |      0.0751 |       0.0891 |
| BM25 [d] + N   | BM25-EXTRACTED+NODES-SYN-QUERIES       |       0.0736 |        0.0797 |      0.0415 |       0.0493 |
| BM25 [d] + N   | BM25-EXTRACTED+NODES-TREC-QUERIES      |       0.0539 |        0.0616 |      0.0336 |       0.0398 |
| BM25 [d]       | BM25-EXTRACTED-ALL-QUERIES             |       0.1056 |        0.1158 |      0.0653 |       0.0759 |
| BM25 [d]       | BM25-EXTRACTED-SYN-QUERIES             |       0.0626 |        0.068  |      0.0367 |       0.0433 |
| BM25 [d]       | BM25-EXTRACTED-TREC-QUERIES            |       0.043  |        0.0479 |      0.0286 |       0.0326 |
| BM25 + N       | BM25-META+EXTRACTED+NODES-ALL-QUERIES  |       0.4095 |        0.4446 |      0.2563 |       0.33   |
| BM25 + N       | BM25-META+EXTRACTED+NODES-SYN-QUERIES  |       0.2299 |        0.2442 |      0.141  |       0.181  |
| BM25 + N       | BM25-META+EXTRACTED+NODES-TREC-QUERIES |       0.1796 |        0.2006 |      0.1153 |       0.1492 |
| BM25           | BM25-META+EXTRACTED-ALL-QUERIES        |       0.4387 |        0.4749 |      0.2805 |       0.3633 |
| BM25           | BM25-META+EXTRACTED-SYN-QUERIES        |       0.2456 |        0.2583 |      0.1538 |       0.1971 |
| BM25           | BM25-META+EXTRACTED-TREC-QUERIES       |       0.1933 |        0.2168 |      0.1269 |       0.1664 |
| BM25 [m] + N   | BM25-META+NODES-ALL-QUERIES            |       0.439  |        0.4685 |      0.273  |       0.3576 |
| BM25 [m] + N   | BM25-META+NODES-SYN-QUERIES            |       0.2526 |        0.2594 |      0.1529 |       0.1971 |
| BM25 [m] + N   | BM25-META+NODES-TREC-QUERIES           |       0.1866 |        0.2091 |      0.1204 |       0.1606 |
| BM25 [m]       | BM25-META-ALL-QUERIES                  |       0.4616 |        0.4808 |      0.2961 |       0.3761 |
| BM25 [m]       | BM25-META-SYN-QUERIES                  |       0.2602 |        0.2646 |      0.1627 |       0.2053 |
| BM25 [m]       | BM25-META-TREC-QUERIES                 |       0.2014 |        0.2163 |      0.1335 |       0.1708 |
| BM25 N         | BM25-NODES-ALL-QUERIES                 |       0.0825 |        0.084  |      0.0401 |       0.046  |
| BM25 N         | BM25-NODES-SYN-QUERIES                 |       0.0484 |        0.0495 |      0.0248 |       0.0282 |
| BM25 N         | BM25-NODES-TREC-QUERIES                |       0.034  |        0.0345 |      0.0153 |       0.0178 |
| TF-IDF [d] + N | CS-EXTRACTED+NODES-ALL-QUERIES         |       0.1048 |        0.1129 |      0.0564 |       0.0667 |
| TF-IDF [d] + N | CS-EXTRACTED+NODES-SYN-QUERIES         |       0.0582 |        0.0615 |      0.0307 |       0.0366 |
| TF-IDF [d] + N | CS-EXTRACTED+NODES-TREC-QUERIES        |       0.0466 |        0.0514 |      0.0257 |       0.0301 |
| TF-IDF [d]     | CS-EXTRACTED-ALL-QUERIES               |       0.078  |        0.0878 |      0.0483 |       0.0572 |
| TF-IDF [d]     | CS-EXTRACTED-SYN-QUERIES               |       0.0439 |        0.0489 |      0.0262 |       0.0317 |
| TF-IDF [d]     | CS-EXTRACTED-TREC-QUERIES              |       0.0341 |        0.0389 |      0.0221 |       0.0255 |
| TF-IDF + N     | CS-META+EXTRACTED+NODES-ALL-QUERIES    |       0.4475 |        0.4708 |      0.2868 |       0.3668 |
| TF-IDF + N     | CS-META+EXTRACTED+NODES-SYN-QUERIES    |       0.2447 |        0.2541 |      0.151  |       0.1941 |
| TF-IDF + N     | CS-META+EXTRACTED+NODES-TREC-QUERIES   |       0.2027 |        0.2167 |      0.1358 |       0.1727 |
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES          |       0.4474 |        0.4648 |      0.2865 |       0.3608 |
| TF-IDF         | CS-META+EXTRACTED-SYN-QUERIES          |       0.2421 |        0.2502 |      0.1486 |       0.1896 |
| TF-IDF         | CS-META+EXTRACTED-TREC-QUERIES         |       0.2053 |        0.2145 |      0.1379 |       0.1712 |
| TF-IDF [m] + N | CS-META+NODES-ALL-QUERIES              |       0.4296 |        0.4447 |      0.2722 |       0.3451 |
| TF-IDF [m] + N | CS-META+NODES-SYN-QUERIES              |       0.2371 |        0.2417 |      0.144  |       0.1829 |
| TF-IDF [m] + N | CS-META+NODES-TREC-QUERIES             |       0.1925 |        0.2031 |      0.1281 |       0.1622 |
| TF-IDF [m]     | CS-META-ALL-QUERIES                    |       0.4247 |        0.4363 |      0.2681 |       0.3371 |
| TF-IDF [m]     | CS-META-SYN-QUERIES                    |       0.231  |        0.2352 |      0.1384 |       0.1764 |
| TF-IDF [m]     | CS-META-TREC-QUERIES                   |       0.1937 |        0.2011 |      0.1296 |       0.1607 |
| TF-IDF N       | CS-NODES-ALL-QUERIES                   |       0.0849 |        0.0826 |      0.0417 |       0.0459 |
| TF-IDF N       | CS-NODES-SYN-QUERIES                   |       0.0498 |        0.0493 |      0.0257 |       0.0284 |
| TF-IDF N       | CS-NODES-TREC-QUERIES                  |       0.0351 |        0.0333 |      0.016  |       0.0175 |
| LMD [d] + N    | LMD-EXTRACTED+NODES-ALL-QUERIES        |       0.1125 |        0.126  |      0.0671 |       0.0796 |
| LMD [d] + N    | LMD-EXTRACTED+NODES-SYN-QUERIES        |       0.0706 |        0.0784 |      0.0421 |       0.0498 |
| LMD [d] + N    | LMD-EXTRACTED+NODES-TREC-QUERIES       |       0.0419 |        0.0477 |      0.025  |       0.0298 |
| LMD [d]        | LMD-EXTRACTED-ALL-QUERIES              |       0.0942 |        0.1091 |      0.0601 |       0.071  |
| LMD [d]        | LMD-EXTRACTED-SYN-QUERIES              |       0.058  |        0.0671 |      0.0368 |       0.0433 |
| LMD [d]        | LMD-EXTRACTED-TREC-QUERIES             |       0.0361 |        0.042  |      0.0233 |       0.0277 |
| LMD + N        | LMD-META+EXTRACTED+NODES-ALL-QUERIES   |       0.2119 |        0.2363 |      0.1284 |       0.1572 |
| LMD + N        | LMD-META+EXTRACTED+NODES-SYN-QUERIES   |       0.1285 |        0.14   |      0.0804 |       0.0969 |
| LMD + N        | LMD-META+EXTRACTED+NODES-TREC-QUERIES  |       0.0834 |        0.0963 |      0.0479 |       0.0604 |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES         |       0.2005 |        0.2272 |      0.126  |       0.153  |
| LMD            | LMD-META+EXTRACTED-SYN-QUERIES         |       0.1277 |        0.1398 |      0.0823 |       0.0981 |
| LMD            | LMD-META+EXTRACTED-TREC-QUERIES        |       0.0729 |        0.0874 |      0.0437 |       0.0549 |
| LMD [m] + N    | LMD-META+NODES-ALL-QUERIES             |       0.3913 |        0.4107 |      0.2517 |       0.3113 |
| LMD [m] + N    | LMD-META+NODES-SYN-QUERIES             |       0.2144 |        0.2197 |      0.1323 |       0.1642 |
| LMD [m] + N    | LMD-META+NODES-TREC-QUERIES            |       0.177  |        0.1911 |      0.1194 |       0.1471 |
| LMD [m]        | LMD-META-ALL-QUERIES                   |       0.4102 |        0.4269 |      0.2702 |       0.3322 |
| LMD [m]        | LMD-META-SYN-QUERIES                   |       0.2219 |        0.2255 |      0.1406 |       0.1726 |
| LMD [m]        | LMD-META-TREC-QUERIES                  |       0.1883 |        0.2014 |      0.1295 |       0.1596 |
| LMD N          | LMD-NODES-ALL-QUERIES                  |       0.0857 |        0.0868 |      0.0426 |       0.0487 |
| LMD N          | LMD-NODES-SYN-QUERIES                  |       0.0508 |        0.0516 |      0.0257 |       0.0296 |
| LMD N          | LMD-NODES-TREC-QUERIES                 |       0.0349 |        0.0352 |      0.0169 |       0.0191 |