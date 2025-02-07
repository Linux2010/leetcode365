package leetcode.leetcode59;

public class Solution {


    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int x = 0, y = 0, dirs = 0;
        for (int i = 1; i <= n * n; i++) {
            ans[x][y] = i;
            int xx = x + DIRS[dirs][0];
            int yy = y + DIRS[dirs][1];
            if (xx < 0 || xx >= n || yy < 0 || yy >= n || ans[xx][yy] != 0) {
                dirs = (dirs + 1) % 4;
            }
//            x = xx;
//            y = yy;
            x += DIRS[dirs][0];
            y += DIRS[dirs][1]; // 走一步
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generateMatrix(3));
    }


}
