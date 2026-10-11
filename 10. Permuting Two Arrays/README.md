# Permuting Two Arrays

**Difficulty:** Easy  
**Preparation Kit:** 1 Month Preparation Kit – Week 1  
**Problem Link:** [HackerRank – Permuting Two Arrays](https://www.hackerrank.com/challenges/one-month-preparation-kit-two-arrays/problem)

## Problem

Given two integer arrays `A` and `B`, each containing `n` elements, and an integer `k`, determine whether the arrays can be rearranged so that:

`A[i] + B[i] >= k`

for every index `i`.

Return:
- `YES` if a valid permutation exists.
- `NO` otherwise.

## Example

**Input:**
```text
k = 10
A = [2, 1, 3]
B = [7, 8, 9]
```

**Output:**
```text
YES
```

**Explanation:**

Rearrange the arrays:

```text
A = [1, 2, 3]
B = [9, 8, 7]
```

Check each pair:

```text
1 + 9 = 10 >= 10
2 + 8 = 10 >= 10
3 + 7 = 10 >= 10
```

All pairs satisfy the condition, so return `YES`.

## Approach (Greedy + Sorting)

1. Sort array `A` in ascending order.
2. Sort array `B` in descending order.
3. Pair the smallest element of `A` with the largest element of `B`.
4. Check whether `A[i] + B[i] >= k` for every index.
5. If any pair fails, return `NO`. Otherwise, return `YES`.

**Why this works:**

Pairing the smallest element of `A` with the largest element of `B` gives the smallest values in `A` the best chance of meeting the required sum. If this arrangement fails, no other permutation can satisfy every pair.

## Complexity Analysis

- **Time Complexity:** `O(n log n)` — Sorting both arrays dominates the execution time.
- **Auxiliary Space Complexity:** Depends on the sorting implementation. The pair-checking loop itself uses `O(1)` extra space.

## Solution

**Language:** Java

[View Solution.java](./Solution.java)
