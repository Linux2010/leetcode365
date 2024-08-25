package leetcode.leetcode746;

public class Solution {


    public int minCostClimbingStairs(int[] cost) {
        int res = Math.min(cost[0],cost[1]);

        for (int i = 3; i < cost.length; i++) {
            res += Math.min(cost[i-1],cost[i]);
            if(cost[i]<=cost[i-1]){
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(new Solution().minCostClimbingStairs(arr));
    }

}
