package leetcode.leetcode415;


//https://leetcode.cn/problems/add-strings/
//415. 字符串相加

class Solution {
    public String addStrings(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        StringBuilder res = new StringBuilder();
        int add = 0;
        while(n>0||m>0||add!=0){
            int x = m>0 ? num1.charAt(m-1) - '0' : 0;
            int y = n>0 ? num2.charAt(n-1) - '0' : 0;
            res.append(String.valueOf((x+y+add)%10));
            add = (x+y+add)/10;
            m--;
            n--;
        }
        return res.reverse().toString();
    }
}