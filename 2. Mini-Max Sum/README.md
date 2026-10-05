# Mini-Max Sum

## Problem

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.

Print the minimum and maximum sums as two space-separated values.

### Example

Input:

    [1, 3, 5, 7, 9]

Output:

    16 24

The minimum sum is obtained by excluding the largest value:

    1 + 3 + 5 + 7 = 16

The maximum sum is obtained by excluding the smallest value:

    3 + 5 + 7 + 9 = 24

## Approach

1. Calculate the sum of all five integers.
2. Find the minimum and maximum values in the array.
3. Subtract the maximum value from the total sum to get the minimum sum.
4. Subtract the minimum value from the total sum to get the maximum sum.
5. Print both results.

Use `long` instead of `int` for the sum to prevent integer overflow.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Solution

See [Solution.java](Solution.java).
