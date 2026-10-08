# Sparse Arrays

## Problem

Given a list of input strings and a list of query strings, determine how many times each query appears in the input list.

Return a list of integers representing the frequency of each query, maintaining the original query order.

**HackerRank Challenge:** [Sparse Arrays](https://www.hackerrank.com/challenges/sparse-arrays/problem)

## Example

**Input:**
```text
strings = ["ab", "ab", "abc"]
queries = ["ab", "abc", "bc"]
```

**Output:**
```text
[2, 1, 0]
```

**Explanation:**
- `"ab"` appears 2 times.
- `"abc"` appears 1 time.
- `"bc"` does not appear.

## Approach

1. Create a `HashMap<String, Integer>` to store the frequency of each input string.
2. Iterate through the input strings and update their occurrence counts.
3. Iterate through the query strings.
4. Retrieve each query's frequency from the map, using `0` when the query is not found.
5. Return the results in the same order as the queries.

## Complexity

Let:
- `n` = number of input strings.
- `q` = number of queries.

- **Time Complexity:** O(n + q) on average, assuming constant-time hash operations.
- **Space Complexity:** O(n + q), including the returned result list.

## Solution

See [Solution.java](Solution.java).
