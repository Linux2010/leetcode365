package leetcode.leetcode54;

import java.util.ArrayList;
import java.util.List;

//54. 螺旋矩阵

//https://leetcode.cn/problems/spiral-matrix/?plan=leetcode_75&plan_progress=sjk0kij
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();

        //模拟法
        int m = matrix.length;
        int n = matrix[1].length;
        int totalLen = m*n;
        //方向矩阵
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        //移动方向索引
        int directionIndex = 0;
        int row = 0, column = 0;
        while (res.size()!=totalLen){
            res.add(matrix[row][column]);
            matrix[row][column]=101;
            //下一次移动 row和column
            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            //判断是否越界或者已走过该格，若是则顺时针改变方向
            if(nextRow<0||nextRow>=m || nextColumn<0 || nextColumn >= n || matrix[nextRow][nextColumn]==101){
                directionIndex = (directionIndex+1)%4;
            }
            //确认新方向的row和column
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return res;
    }
}