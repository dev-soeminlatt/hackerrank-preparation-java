# Pangrams

**Difficulty:** Easy  
**Preparation Kit:** 1 Month Preparation Kit – Week 1  
**Problem Link:** [HackerRank – Pangrams](https://www.hackerrank.com/challenges/one-month-preparation-kit-pangrams/problem)

## Problem

Given a string `s`, determine whether it is a **pangram**.

A pangram is a sentence containing every letter of the English alphabet (`a-z`) at least once, regardless of case.

Return:
- `pangram` if all 26 letters are present.
- `not pangram` otherwise.

## Example

**Input:**
```
We promptly judged antique ivory buckles for the next prize
```

**Output:**
```
pangram
```

**Explanation:**

The string contains all 26 letters of the English alphabet.

## Approach

1. Convert the input string to lowercase.
2. Use a `HashSet<Character>` to store unique alphabetic characters.
3. Iterate through the string, ignoring spaces.
4. Add each letter to the set.
5. If the set contains 26 unique letters, return `pangram`. Otherwise, return `not pangram`.

## Complexity Analysis

- **Time Complexity:** `O(n)` — Traverse the input string once.
- **Space Complexity:** `O(1)` — The set stores at most 26 English letters.

## Solution

**Language:** Java

[View Solution.java](./Solution.java)
