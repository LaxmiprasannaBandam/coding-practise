# URLify Problem

## Problem
Write a method to replace all spaces in a string with '%20'.  
You are given the "true" length of the string, and the string has extra space at the end to accommodate additional characters.  

### Example
Input: `"Mr John Smith    "`, True length = `13`  
Output: `"Mr%20John%20Smith"`

### Key Points
- Replace spaces `' '` with `"%20"` in place  
- True length tells you which part of the string is meaningful  
- Extra space at the end allows expanding the string  
- Traverse **right to left** to avoid overwriting characters  
