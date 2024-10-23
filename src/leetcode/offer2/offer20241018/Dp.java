package leetcode.offer2.offer20241018;

public class Dp {
    public static void main(String[] args) {
        int m =5;
        int n =10;
        //1，创建一个mxn的数组矩阵
        int[][] dp = new int[m][n];
        //2，将第一行和第一列赋值为1
        for (int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        //3，按动态转移方程计算数组中的每个值，dp[m][n] = dp[m-1][n]+dp[m][n-1]
        for(int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
