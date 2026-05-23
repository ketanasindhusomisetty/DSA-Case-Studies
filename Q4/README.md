# Delhi-NCR Delivery Routing using Bidirectional Dijkstra

## Objective
This project demonstrates shortest path routing in a Delhi-NCR road network using Dijkstra and Bidirectional Dijkstra algorithms.

## Concepts Used
- Weighted Graph
- Dijkstra Algorithm
- Bidirectional Search
- Priority Queue
- Shortest Path Routing

## Description
The project models delivery routing between Connaught Place (CP) and Greater Noida West (GNW). It compares standard Dijkstra and Bidirectional Dijkstra for efficient shortest path computation.

## Shortest Path
CP → SAK → NOI → GNW

Total Distance:
41

## Time Complexity
Standard Dijkstra:
O((V + E) log V)

Bidirectional Dijkstra:
Approximately O((V/2 + E/2) log(V/2))

## Conclusion
Bidirectional Dijkstra reduces graph exploration while maintaining shortest-path correctness, making it suitable for large-scale routing systems.
