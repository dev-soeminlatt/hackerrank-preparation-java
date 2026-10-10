# Diagonal Difference

## Problem

Given a square matrix of integers, calculate the absolute difference between the sums of its two diagonals.

**HackerRank Challenge:** [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem)

## Example

**Input:**

```text
3
11  2   4
4   5   6
10  8  -12
```

**Output:**

```text
15
```

**Explanation:**

Primary diagonal (top-left to bottom-right):

`11 + 5 + (-12) = 4`

Secondary diagonal (top-right to bottom-left):

`4 + 5 + 10 = 19`

Absolute difference:

`|4 - 19| = 15`

## Approach

1. Initialize two variables, `primarySum` and `secondarySum`, to `0`.
2. Iterate through each row of the square matrix.
3. Add the element at `[i][i]` to `primarySum`.
4. Add the element at `[i][n - 1 - i]` to `secondarySum`.
5. Calculate the absolute difference using `Math.abs(primarySum - secondarySum)`.
6. Return the result.

## Complexity

Let `n` be the number of rows and columns in the matrix.

- **Time Complexity:** O(n) — Only the diagonal elements are processed.
- **Space Complexity:** O(1) — Only two variables are used to store the diagonal sums.

## Solution

See [Solution.java](Solution.java).
