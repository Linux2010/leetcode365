package leetcode.leetcode940;

import java.util.HashSet;

//940. 不同的子序列 II
//https://leetcode.cn/problems/distinct-subsequences-ii/
public class Solution{
    //完全错误的思路，三次for也无法找全
    public int distinctSubseqII_Error(String s) {

        HashSet<String> set = new HashSet<>();
        //打散，排序组合
        for (int k = 0; k < s.length(); k++) {
            for (int i = k; i < s.length(); i++) {
                String start = s.substring(k,i);
                for (int j = i; j < s.length(); j++) {
                    set.add(start+s.charAt(j));
                    System.out.println(start+s.charAt(j));
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().distinctSubseqII("bebb"));
    }

    public int distinctSubseqII(String s) {
        return 0;
    }
}
