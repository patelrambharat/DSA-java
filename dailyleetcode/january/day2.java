520. Detect Capital
Easy
2.8K
417
Companies
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

 

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false

class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int upper =0;
        for(int i=0;i<n;i++){
            if(word.charAt(i) >='A' && word.charAt(i) <='Z'){
                upper++;
              
                
            }
        }
        if(upper ==0 || upper == n) return true;
        else if(upper ==1 && word.charAt(0) >='A' && word.charAt(0) <='Z') return true;
        else return false;
    }
}

Tc : O(n)
Sc: O(1)