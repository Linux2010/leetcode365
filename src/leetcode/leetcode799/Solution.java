package leetcode.leetcode799;

//https://leetcode.cn/problems/champagne-tower/
//799. 香槟塔
//medium
public class Solution {

    //first：
    //根据题意，行数好算， n>2, 2*(n-2)+2  = 2n-2,
    // 第n层，两边需要 (2n-2)瓶， 其他需要 n-1瓶。
    public double champagneTower(int poured, int query_row, int query_glass) {
        int sn = query_row*(query_row+1)/2;
        return 0.0;
    }
}