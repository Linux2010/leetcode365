package leetcode.leetcode344;

public class Solution {


    //https://leetcode.cn/problems/reverse-string/

    /**
     * 字符反转
     * @param s
     */
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

}
