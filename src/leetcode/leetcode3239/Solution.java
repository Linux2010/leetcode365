package leetcode.leetcode3239;

public class Solution {



    public int minFlips(int[][] grid) {
        int resX =0;
        int resY =0;
        int x = grid[0].length;
        int y = grid.length;
        for(int i = 0; i < y; i++) {
            int l = 0;
            int r = x-1;
            while (l < r){
                if(grid[i][l] != grid[i][r]) resX++;
                l++;
                r--;
            }
        }
        for(int j = 0; j < x; j++){
            int up =0;
            int down = y-1;
            while (up < down){
                if(grid[up][j] != grid[down][j]) resY++;
                up++;
                down--;
            }
        }
        return Math.min(resX,resY);
    }
    
    public static void main(String[] args) {
        
    }
}
