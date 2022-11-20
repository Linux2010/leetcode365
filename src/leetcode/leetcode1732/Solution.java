package leetcode.leetcode1732;

//1732. 找到最高海拔
//https://leetcode.cn/problems/find-the-highest-altitude/
//easy
public class Solution {


    public int largestAltitude(int[] gain) {
        int res =0;
        int tmp = 0;
        for (int i = 0; i < gain.length; i++) {
            res = Math.max(res,tmp+=gain[i]);
        }
        return res;
    }

}
