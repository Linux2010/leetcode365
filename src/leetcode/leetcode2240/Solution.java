package leetcode.leetcode2240;

public class Solution {


    //暴力解法，超出时间限制 ，1000000，1，1
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if (cost1 < cost2) {
            return waysToBuyPensPencils(total, cost2, cost1);
        }
        long res = 0, cnt = 0;
        while (cost1*cnt<=total){
            res += (total-cost1*cnt) / cost2 + 1;
            cnt++;
        }
        return res;
    }

    public static void main(String[] args) {
        new Solution().waysToBuyPensPencils(1000000,1,1);
    }

}
