package leetcode.leetcode1710;

import java.util.Arrays;

//1710. 卡车上的最大单元数
//https://leetcode.cn/problems/maximum-units-on-a-truck/
//EASY
public class Solution {
    //贪心算法
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0 ;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for (int i = 0; i < boxTypes.length; i++) {
            if(truckSize>boxTypes[i][0]){
                res+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            } else if (truckSize>0) {
                res+=truckSize*boxTypes[i][1];
                return res;
            }
        }
        return res;
    }
}
