package leetcode.leetcode2706;

import java.util.Arrays;

public class Solution {

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int res = money-prices[0]-prices[1];
        if(res<0){
            return money;
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
