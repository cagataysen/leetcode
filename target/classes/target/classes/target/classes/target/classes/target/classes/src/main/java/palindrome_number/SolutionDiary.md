## Solution:

Negative number couldn't be a palindrome. 

Using string for such comparison is easy to me. That is why reversing the given integer, then comparing it with our 
String will give us the result. We don't need to create extra if else statement because return will be true or false accordingly.




## Question:

Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1