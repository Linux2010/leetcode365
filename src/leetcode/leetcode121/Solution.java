package leetcode.leetcode121;

//121. 买卖股票的最佳时机
//easy
//https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
public class Solution {
    //动态规划解题， getNow<0需要重置
    public int maxProfit(int[] prices) {
        int ans = 0;
        int getNow = 0;
        for (int i = 1; i < prices.length; i++) {
            getNow=getNow+prices[i]-prices[i-1];
            if(getNow<0){
                getNow=0;
            }
            ans = Math.max(getNow,ans);
        }
        return ans;
    }
}
