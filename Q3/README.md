# Microsoft Teams Meeting Graph using SCC

## Objective
This project demonstrates how Strongly Connected Components (SCC) are identified in a directed graph using Tarjan’s Algorithm.

## Concepts Used
- Graph Theory
- Directed Graph
- DFS Traversal
- Tarjan’s Algorithm
- Strongly Connected Components (SCC)

## Description
The project models Microsoft Teams meetings as a directed graph where meetings are connected through participant transitions. Tarjan’s SCC algorithm is used to detect tightly connected meeting clusters efficiently.

## SCCs Identified
- SCC1 = {m1, m2, m3}
- SCC2 = {m4, m5, m6}
- SCC3 = {m7, m8}

## Time Complexity
Tarjan’s Algorithm:
O(V + E)

where:
- V = Number of vertices
- E = Number of edges

## Conclusion
Tarjan’s algorithm efficiently identifies strongly connected meeting clusters using a single DFS traversal with linear time complexity.
