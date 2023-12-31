package leetcode.leetcode1154;

public class Solution {
    public int dayOfYear(String date) {
        int res =0;
        String year = date.substring(0, 4);
        String month = date.substring(5,7);
        String day = date.substring(8,10);
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        // 31,28,31,30,31,30,31,31,30,31,30,31
        int[] arr = {0,0,31,59,90,120,151,181,212,243,273,304,334};
        if(isLeapYear(y)&&m>2)  res = 1;
        res = res + arr[m] +d;
        return res;
    }



    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new Solution().dayOfYear("2022-12-12");
    }

}
