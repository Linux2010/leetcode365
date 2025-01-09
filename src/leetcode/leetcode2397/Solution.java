package leetcode.leetcode2397;
//https://leetcode.cn/problems/count-substrings-that-can-be-rearranged-to-contain-a-string-i/description/
public class Solution {


    /**
     * 滑动窗口
     * @param word1
     * @param word2
     * @return
     */
    public long validSubstringCount(String word1, String word2) {
        long ans = 0L;
        if(word1.length()<word2.length()) return ans;

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int[] diff = new int[26];

        // w2的字母分布
        for (char c : w2) {
            diff[c-'a']++;
        }
        int count = 0;
        for (int d : diff) {
            if(d >0) count++;
        }
        int left = 0;

        for (char c : w1) {
            diff[c - 'a']--;
            if(diff[c-'a'] == 0){
                //c入窗后,窗口内c的次数与 w2一样
                count--;
            }
            while (count == 0){
                char out = w1[left];
                left++;
                if(diff[out-'a']==0) count++;
                diff[out-'a']++;
            }
            ans += left;
        }
        return ans;
    }
}