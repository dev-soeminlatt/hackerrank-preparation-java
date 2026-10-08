# Lonely Integer

## Problem

Given an array of integers where every element appears exactly twice except for one unique element, find and return the integer that occurs only once.

**HackerRank Challenge:** [Lonely Integer](https://www.hackerrank.com/challenges/lonely-integer/problem)

## Example

**Input:**
```text
a = [1, 2, 3, 4, 3, 2, 1]
```

**Output:**
```text
4
```

**Explanation:**
- `1` appears twice.
- `2` appears twice.
- `3` appears twice.
- `4` appears only once.

Therefore, the unique integer is `4`.

## Approach

Use the **Bitwise XOR (`^`)** operator to identify the unique integer.

1. Initialize a variable `result` to `0`.
2. Iterate through the array.
3. Apply XOR between `result` and each element.
4. Duplicate elements cancel each other out because `x ^ x = 0`.
5. Return the remaining value.

### XOR Properties

- `x ^ x = 0`
- `x ^ 0 = x`
- XOR is commutative and associative.

For example:

```text
1 ^ 2 ^ 3 ^ 4 ^ 3 ^ 2 ^ 1 = 4
```

## Complexity

Let `n` be the number of elements in the array.

- **Time Complexity:** O(n) — Each element is processed once.
- **Space Complexity:** O(1) — Only one additional variable is required.

## Solution

See [Solution.java](Solution.java).
