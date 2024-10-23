package leetcode.offer2.offer20241018;

import java.util.Arrays;

public class Main {

    /**
     * 问题：给定一个包含字母、数字的字符串A
     *   1. 拆分成「字母逆序」a、「数字顺序」b的两部分，将a、b组成新的字符串C, 打印输出C；
     *   2. 输出字符串C中【同时包含字母和数字】且【字符不重复】的【最长连续】子串;
     * 比如入参：2accdfe398
     *    1.输出：fedcca2389
     *    2.输出：ca2389
     *
     * 现在给你一个字符串：586agbc36ce7, 请编写java代码进行结果输出。
     **/

    public static void main(String[] args) {
        String input = "sf0zdg24";
        String res1 = q1(input);
        System.out.println(res1);
        String res2 = q2(res1);
        System.out.println(res2);
    }

    private static String q1(String input){
       Character[] arr = new Character[input.length()];
       for(int i=0;i<input.length();i++){
           arr[i]=input.charAt(i);
       }
       //数字在前，字母在后
       Arrays.sort(arr);
       int i=0;
       int j=arr.length-1;
       StringBuffer digits = new StringBuffer();
       StringBuffer letters = new StringBuffer();
       while(i<=j){
           if(Character.isDigit(arr[i])){
               digits.append(arr[i]);
               i++;
           }
           if(Character.isLetter(arr[j])){
               letters.append(arr[j]);
               j--;
           }
       }
        //4,时间复杂度：O(n) ,空间复杂度:O(n)
       return letters.toString()+digits;
    }


    private static String q2(String input){
        //1,先定位到第一个数字位置
        int index =-1;
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                index =i;
                break;
            }
        }
        //2,双指针向左右延伸，退出规则 字母：input[i-1]<=input[i] , 数字：input[i]>=input[i+1]
        int left=index;
        int right=index+1;
        while(left>0 && input.charAt(left-1)>input.charAt(left)){
            left--;
        }
        while(right<input.length() && input.charAt(right-1)<input.charAt(right)){
            right++;
        }
        //3,按指针位置取subString
        //4,时间复杂度：O(n) ,空间复杂度:O(1)
        return input.substring(left,right);
    }

}
