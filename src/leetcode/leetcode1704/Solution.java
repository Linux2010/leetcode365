package leetcode.leetcode1704;

import java.util.Arrays;
import java.util.HashSet;

//1704. 判断字符串的两半是否相似
//easy
//https://leetcode.cn/problems/determine-if-string-halves-are-alike/description/
class Solution {


    public boolean halvesAreAlike(String s) {
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for (int i = 0,j=s.length()/2; j < s.length(); i++,j++) {
            if(set.contains(s.charAt(i))) left++;
            if(set.contains(s.charAt(j))) right++;
        }
        return left==right;
    }
}