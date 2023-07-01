package leetcode.leetcode66;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(i>=0){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
            i--;
        }
        int[] res = new int[digits.length+1];
        res[0]=1;
        System.arraycopy(digits, 0, res, 1, digits.length);
        return res;
    }
    public static void main(String[] args) {
        int[] source = {9, 9, 9, 9, 9};
        int [] arr = new Solution().plusOne(source);
        Arrays.stream(arr).forEach(System.out::println);
    }
}