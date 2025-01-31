package leetcode.leetcode541;

public class Solution {

    public String reverseStr(String s, int k) {
        char[] ans = s.toCharArray();
        for (int i = 0; i < s.length(); i+=2*k) {
            reverseString(ans,i,Math.min(i+k,s.length())-1);
        }
        return new String(ans);
    }


    private void reverseString(char[] s,int left,int right) {
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
