# Zomato Delivery ETA using Quickselect

## Objective
This project demonstrates how Quickselect and Median of Medians algorithms are used to efficiently compute median delivery ETAs.

## Concepts Used
- Quickselect
- Partitioning
- Randomized Pivot
- Median of Medians
- Divide and Conquer

## Description
The project analyzes how Zomato can compute median ETA values without fully sorting large datasets. It compares randomized Quickselect with deterministic Median of Medians selection.

## Median Found
Median ETA = 28

## Time Complexity
Quickselect:
- Expected: O(n)
- Worst Case: O(n²)

Median of Medians:
- Worst Case: O(n)

## Conclusion
Quickselect provides fast average-case performance for real-world systems, while Median of Medians guarantees deterministic linear-time selection.
