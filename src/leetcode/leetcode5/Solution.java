package leetcode.leetcode5;


//https://leetcode.cn/problems/longest-palindromic-substring/description/
//5. 最长回文子串
//EASY

class Solution {

    //暴力解题
    public String longestPalindrome(String s) {
        if("".equals(s)){
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if(palindrome(s.substring(i,j))){
                    if(j-i>end-start){
                        end=j;
                        start=i;
                    }
                }
            }

        }
        return s.substring(start,end);
    }

    private boolean palindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome(""));
    }
}