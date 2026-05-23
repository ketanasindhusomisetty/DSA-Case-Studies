# DuckDB Columnar Storage using Skip-Index

## Objective
This project demonstrates how DuckDB and column-oriented databases use skip-index or zone-map structures for fast filtering.

## Concepts Used
- Skip Index
- Zone Map
- Block Filtering
- Clustered Storage

## Description
The project analyzes the storage overhead of skip-index structures and compares clustered versus non-clustered filtering performance.

## Time Complexity
- Metadata Lookup: O(1)
- Block Scanning: O(number of matching blocks)

## Conclusion
Zone maps improve query performance significantly while requiring very small storage overhead.
