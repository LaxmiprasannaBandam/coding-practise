1️⃣ Brute Force Approach
For each character in s1, try to find and remove it from s2
If any character is missing → not a permutation
⏱ Time Complexity: O(n²) — WHY?
For every character in s1 (n times)
We search through s2 (n times)
n × n = n²
Space Complexity: O(1) — WHY?
No extra data structure used
Only variables
2️⃣ Better Approach (Sorting)
If two strings are permutations, their sorted versions must be identical
⏱ Time Complexity: O(n log n) — WHY?
Sorting first string → O(n log n)
Sorting second string → O(n log n)
Comparison → O(n)
Dominant term: O(n log n)
Space Complexity: O(1) — WHY?
Sorting done in-place
No extra memory that grows with input size
3️⃣ Better Approach (Sorting)
Optimal Approach (Character Count)
Count frequency of each character in first string
Decrease count using second string
If any count becomes negative → not a permutation
⏱ Time Complexity: O(n) — WHY?
Each string is traversed once
Each character operation is constant time O(1)
Space Complexity: O(1) — WHY?
Fixed-size array (128 for ASCII)
Space does not depend on input size
Total operations proportional to n
🧠 Space Complexity: O(1) — WHY?
Fixed-size array (128 for ASCII)
Space does not depend on input size
