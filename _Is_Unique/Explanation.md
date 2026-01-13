## 🧠 Explanation – Is Unique

### 1️⃣ Brute Force Approach
- Compare every character with every other character.
- If any duplicate is found → return false.
**Why it works:**  
It checks all possible pairs of characters.
- Time Complexity: O(n²)
- Space Complexity: O(1)
---
1️⃣ Brute Force Approach
⏱ Time Complexity: O(n²) — Why?
The outer loop runs n times
For each iteration, the inner loop also runs up to n times
Total comparisons ≈ n × n = n²
 That is why time complexity is O(n²).
 Space Complexity: O(1) — Why?
No extra data structure is used
Only a few variables are used
 Extra space does not grow with input size
--------------
### 2️⃣ Better Approach (Using Array)
- Use a boolean array to mark visited characters.
- If a character appears again → not unique.
**Why it works:**  
Each character is processed once.
- Time Complexity: O(n)
- Space Complexity: O(1) (ASCII size fixed)
- ⏱ Time Complexity: O(n) — Why?
We traverse the string once
Each character is checked and marked in constant time O(1)
   Total operations proportional to n
   Hence, time complexity is O(n).
   Space Complexity: O(1) — Why?
Boolean array size is fixed (128 for ASCII)
Space does not depend on input length
Constant space → O(1)
---
### 3️⃣ Optimal Approach (Sorting)
- Sort the string.
- Check adjacent characters.
**Why it works:**  
Duplicates will be placed next to each other after sorting.
- Time Complexity: O(n log n)
- Space Complexity: O(1)
- Time Complexity: O(n log n) — Why?
Sorting n characters takes O(n log n)
Single traversal after sorting is O(n)
Dominant term is O(n log n)
So total time complexity = O(n log n)
Space Complexity: O(1) — Why?
Sorting is done in-place
No extra data structure used
Constant extra space → O(1)

