package leetcode.leetcode2299;

import java.util.regex.*;
class Solution {
    //2299. 强密码检验器 II
    //必须包含英文，数字，字符且密码长度大于8位
    public boolean strongPasswordCheckerII(String password) {
        return  password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?!.*(.)\\1+).{8,}$");
    }

    public static void main(String[] args) {
        System.out.println( new Solution().strongPasswordCheckerII("AWa1s#$dfa(dsf23"));

    }
}