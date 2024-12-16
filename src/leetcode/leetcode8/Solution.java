package leetcode.leetcode8;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println(new Solution().myAtoi_2("    a111sa11111111111111337c0d3"));
    }


    public int myAtoi_1(String s) {
        int n =  s.length();
        int res =0;
        int f = 1;
        int end = 0;
        int start =0;
        boolean open = false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '-') f = -1;
            if(!open&&!Character.isDigit(c)){
                break;
            }
            if(Character.isDigit(c)&& !open){
                start = i;
                end = i;
                open = true;
            }
            if(Character.isDigit(c)&& open){
                end = i;
            }
            if(!Character.isDigit(c) && open){
                break;
            }
        }
        System.out.printf("start:%s, end:%s%n", start,end);
        String sub = s.substring(start,end+1);
        System.out.println(sub);
        if(sub.isEmpty())return 0;
        try {
            res = Integer.parseInt(sub)*f;
        }catch (NumberFormatException e){
            if(f==-1){
                res = Integer.MIN_VALUE;
            }else {
                res = Integer.MAX_VALUE;
            }
        }
        return res;
    }

    public int myAtoi_2(String s) {
        String regex = "^\\s*(\\d+|-\\d+)"; // 正则表达式
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int res = 0;
        if(matcher.find()){
            String sub = matcher.group(1); // 提取捕获组
            System.out.println(sub);
            try {
                res = Integer.parseInt(sub);
            }catch (Exception e){
                if(sub.charAt(0)=='-'){
                    res = Integer.MIN_VALUE;
                }else {
                    res = Integer.MAX_VALUE;
                }
            }
        }
        return res;
    }





}
