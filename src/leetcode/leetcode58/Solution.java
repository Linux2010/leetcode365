package leetcode.leetcode58;

//58. 最后一个单词的长度
//https://leetcode.cn/problems/length-of-last-word/
//easy

public class Solution {

    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }
}