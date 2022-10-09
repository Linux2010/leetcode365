package leetcode.leetcode1706;

import java.sql.Array;

//https://leetcode.cn/problems/where-will-the-ball-fall/
//1706. 球会落何处
public class Solution {
    public int[] findBall(int[][] grid) {
        //模拟
        //我们依次判断每个球的最终位置。对于每个球，从上至下判断球位置的移动方向。
        // 在对应的位置，如果挡板向右偏，则球会往右移动；如果挡板往左偏，则球会往左移动。
        // 若移动过程中碰到侧边或者 \text{V}V 型，则球会停止移动，卡在箱子里。
        // 如果可以完成本层的移动，则继续判断下一层的移动方向，直到落出箱子或者卡住。
        //todo 代码优化
        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            int column=i;
            for (int[] ints : grid) {
                if (column == 0 && ints[column] == -1) {
                    res[i] = -1;
                    break;
                } else if (column == grid[0].length - 1 && ints[column] == 1) {
                    res[i] = -1;
                    break;
                } else if (ints[column] == 1 && ints[column + 1] == -1) {
                    res[i] = -1;
                    break;
                } else if (ints[column] == -1 && ints[column - 1] == 1) {
                    res[i] = -1;
                    break;
                } else if (ints[column] == -1) {
                    column--;
                } else {
                    column++;
                }
            }
            if (res[i]!=-1){
                res[i]=column;
            }
        }
        return res;
    }
}
