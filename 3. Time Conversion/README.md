# Time Conversion

## Problem

Given a time in 12-hour AM/PM format, convert it to 24-hour (military) time.

### Examples

Input:

    07:05:45PM

Output:

    19:05:45

Special cases:

    12:00:00AM → 00:00:00
    12:00:00PM → 12:00:00

## Approach

1. Determine whether the input time is `AM` or `PM`.
2. Extract the hour from the input.
3. Handle the special case for hour `12`:
   - `12 AM` becomes `00`.
   - `12 PM` remains `12`.
4. For other `PM` times, add `12` to the hour.
5. Remove the `AM`/`PM` suffix and return the time in `HH:mm:ss` format.

## Complexity

- Time Complexity: O(1)
- Space Complexity: O(1)

## Solution

See [Solution.java](Solution.java).
