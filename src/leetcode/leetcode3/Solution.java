package leetcode.leetcode3;

import java.util.HashMap;
import java.util.HashSet;

//3. 无重复字符的最长子串
//  https://leetcode.cn/problems/longest-substring-without-repeating-characters/
class Solution {
    public static  int lengthOfLongestSubstring(String s) {
        //长度记录器res
        //map作为临时存储，key为char，value为位置+1，记录当前位置信息下一位，即为从字符位置后一个才开始不重复
        //for循环遍历
        int res = 0;
        int start = 0;
        HashMap<Character, Integer> tmpMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(tmpMap.containsKey(c)){
                //使用math方法，判断当前最大的start，避免start回退
                start = Math.max(tmpMap.get(c),start);
            }
            tmpMap.put(c,i+1);
            res = Math.max(i+1-start,res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));

    }


    public int lengthOfLongestSubstring2(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

}