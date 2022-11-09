package leetcode.leetcode1684;

import java.util.HashMap;
import java.util.HashSet;

//1684
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res =0;
        HashSet<Character> hashSet = new HashSet<Character>();
        for (int i = 0; i < allowed.length(); i++) {
            hashSet.add(allowed.charAt(i));   
        }
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if(!hashSet.contains(word.charAt(i))){
                    flag  = false;
                    break;
                }
            }
            if (flag){
                res++;
            }
        }
        return res;
    }
}