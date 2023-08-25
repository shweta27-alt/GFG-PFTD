// Palindrome String
// EasyAccuracy: 51.21%Submissions: 266K+Points: 2
// 30% Off on all premium courses! Enrol today and utilize this offer before placement ends

// Given a string S, check if it is palindrome or not.

// Example 1:

// Input: S = "abba"
// Output: 1
// Explanation: S is a palindrome
// Example 2:

// Input: S = "abc" 
// Output: 0
// Explanation: S is not a palindrome
// Your Task:
// You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

// Expected Time Complexity: O(Length of S)
// Expected Auxiliary Space: O(1)

class Solution {
    int isPalindrome(String S) {
        for(int i=0;i<(S.length())/2;i++){
            if(S.charAt(i) != S.charAt((S.length()-1)-i)){
                return 0;
            }
        }
        return 1;
    }
};
