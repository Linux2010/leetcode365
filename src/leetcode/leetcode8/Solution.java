package leetcode.leetcode8;

import java.util.HashSet;

//https://leetcode.cn/problems/string-to-integer-atoi/
//8. 字符串转换整数 (atoi)
public class Solution {

    //2022-11-23
    //我的思路：
    //按题目遍历s,
    //找到想要的字符，numberFlag=true，如果为true不在set里，break。
    //1,先拿到-或者+ ，用boolean
    //2，先拿到数字
    //
    public int myAtoi(String s) {
        String s_trim = s.trim();
        String[] arr = s_trim.split(" ");

        int len = arr[0].length();
        //11,10
        if(len<10){
            try {
                return Integer.parseInt(arr[0]);
            }catch (Exception e){
                return 0;
            }
        }
        char c = arr[0].charAt(0);
        //10
        //10 - +

        if(len==10&&Character.isDigit(c)){
            try {
                return Integer.parseInt(arr[0]);
            }catch (Exception e){
                return Integer.MAX_VALUE;
            }
        }else {
            try {
                return Integer.parseInt(arr[0]);
            }catch (Exception e){
                return 0;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.valueOf("+123"));
        System.out.println(new Solution().myAtoi("-91283472332"));
    }


}
