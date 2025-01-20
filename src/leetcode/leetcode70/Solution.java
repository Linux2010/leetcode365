package leetcode.leetcode70;

public class Solution {
    public static void main(String[] args) {

    }
    public int climbStairs (int n) {
        return dfs(n);
    }


    private int dfs(int n){
        if(n <= 1){
            return 1;
        }
        return dfs(n-1) + dfs(n-2);
    }


    public int climbStairs_memo (int n) {
        int[] memo = new int[n];

        return dfs(n,memo);
    }


    private int dfs(int n,int[] memo){
        if(n <= 1){
            return 1;
        }
        if(memo[n] !=0){
            return memo[n];
        }
        return dfs(n-1) + dfs(n-2);
    }




}
