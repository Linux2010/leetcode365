package leetcode.leetcode764;

//https://leetcode.cn/problems/largest-plus-sign/
//medium
//764. 最大加号标志
class Solution {

    //1,up,down,left,right
    //2,取4个中最小的一个，然后对比
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int res = 0 ;
        int[][] grid = new int[n][n];
        //1,初始化矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j]=1;
            }
        }

        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = 0;
        }

        //2,循环遍历grid记录轴对称
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==0){
                    continue;
                }
                //left
                int leftLen = 0;
                while (j-leftLen>=0&&grid[i][j-leftLen]!=0){
                    leftLen++;
                }
                //right
                int rightLen = 0;
                while (j+rightLen<n&&grid[i][j+rightLen]!=0){
                    rightLen++;
                }
                //top
                int topLen = 0;
                while (i-topLen>=0&&grid[i-topLen][j]!=0){
                    topLen++;
                }
                //bottom
                int bottomLen =0;
                while (i+bottomLen<n&&grid[i+bottomLen][j]!=0){
                    bottomLen++;
                }
                int tmp_res = Math.min(leftLen,Math.min(rightLen,Math.min(topLen,bottomLen)));
                res = Math.max(tmp_res,res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new Solution().orderOfLargestPlusSign(5,new int[][]{{4,2}});
    }

}