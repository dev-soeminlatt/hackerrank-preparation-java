# Plus Minus

## Problem

Given an array of integers, calculate the ratios of:

- Positive numbers
- Negative numbers
- Zeros

Print each ratio on a separate line with 6 digits after the decimal point.

### Example

Input:

    [-4, 3, -9, 0, 4, 1]

Output:

    0.500000
    0.333333
    0.166667

## Approach

1. Iterate through the array once.
2. Count the positive, negative, and zero values.
3. Divide each count by the total number of elements.
4. Print each ratio with 6 decimal places.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Solution

See [Solution.java](Solution.java).
