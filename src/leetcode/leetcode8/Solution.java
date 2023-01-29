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
        int res=0;
        int len = s.length();
        int sign = 1;
        int i = 0;
        int max =Integer.MAX_VALUE/10;
        int min = Integer.MIN_VALUE/10;
        while (i<len&&s.charAt(i)==' '){
            i++;
        }
        if (i==len) return res;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        } else if (s.charAt(i)=='+') {
            i++;
        }
        for (; i < len; i++) {
            if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                res=res*10 + Character.getNumericValue(s.charAt(i)) ;
                if(res>max&&sign==1) return Integer.MAX_VALUE;
                else if (-res<min&&sign==-1) return Integer.MIN_VALUE;
            }else {
                break;
            }
        }
        return res*sign;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("2147483649"));
    }


}
