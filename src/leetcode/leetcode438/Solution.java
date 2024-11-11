package leetcode.leetcode438;

import java.util.*;

public class Solution {

    //
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] cntP = new int[26]; // 记录p的每个字母数量
        int[] cntS = new int[26]; // 记录s的每个字母数量
        for(char c : p.toCharArray()){
            cntP[c-'a'] ++; //初始化p的每个字母数量
        }
        for (int r =0;r<s.length();r++){
            cntS[s.charAt(r)-'a']++; //添加s当前字母到 cntS里
            int l = r-p.length()+1; //计算滑动窗口的left
            if(l<0) continue; // 窗口不是p.len则不退出窗口
            if(Arrays.equals(cntP,cntS)) ans.add(l); //窗口长度相同时，计算cntS与cntP是否相同，相同ans.add
            cntS[s.charAt(l)-'a']--; //left退出窗口
        }
        return  ans;
    }
}
