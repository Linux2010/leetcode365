package leetcode.leetcode2697;

import java.util.Arrays;

public class Solution {


    public String makeSmallestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0,j=s.length()-1; i <j ; i++,j--) {
            if(s.charAt(i)!=s.charAt(j)){
                if(s.charAt(i) - 'a' <= s.charAt(j)-'a') charArray[j]=s.charAt(i);
                else charArray[i] = s.charAt(j);
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(new  Solution().makeSmallestPalindrome("abccbb"));
    }
}
