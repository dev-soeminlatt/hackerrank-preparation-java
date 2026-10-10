# Counting Sort 1

## Problem

Given a list of integers ranging from `0` to `99`, count how many times each integer appears and return a frequency array containing exactly 100 elements.

Unlike traditional comparison-based sorting algorithms, counting sort uses a frequency array to count occurrences of each value.

**HackerRank Challenge:** [Counting Sort 1](https://www.hackerrank.com/challenges/countingsort1/problem)

## Example

**Input:**

```text
arr = [1, 1, 3, 2, 1]
```

**Output:**

```text
[0, 3, 1, 1, 0, 0, ...]
```

The output contains exactly 100 integers. All remaining positions are `0`.

**Explanation:**

- `0` appears 0 times.
- `1` appears 3 times.
- `2` appears 1 time.
- `3` appears 1 time.

Therefore, the first four elements of the frequency array are `[0, 3, 1, 1]`.

## Approach

1. Initialize a frequency array of size `100`, with all elements set to `0`.
2. Iterate through each integer in the input list.
3. Use the integer value as an index in the frequency array.
4. Increment the count at that index.
5. Return the frequency array containing exactly 100 elements.

**Important:** This challenge requires returning the frequency array, not the sorted input array.

## Complexity

Let `n` be the number of elements in the input list and `k = 100` be the fixed range of possible values.

- **Time Complexity:** O(n + k), which simplifies to O(n) because `k` is constant.
- **Space Complexity:** O(k), which simplifies to O(1) because the frequency array always contains 100 elements.

## Solution

See [Solution.java](Solution.java).
