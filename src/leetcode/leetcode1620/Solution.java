package leetcode.leetcode1620;

import java.util.*;

//https://leetcode.cn/problems/coordinate-with-maximum-network-quality/description/
//MEDIUM
//1620. 网络信号最好的坐标
class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;
        for (int[] tower : towers) {
            xMax = Math.max(xMax, tower[0]);
            yMax = Math.max(yMax, tower[1]);
        }
        int xRes = 0;
        int yRes = 0;
        int maxQuality = 0;
        for (int i = 0; i <= xMax; i++) {
            for (int j = 0; j <= yMax; j++) {
                int quality = 0;
                for (int[] tower : towers) {
                    int q = getQuality(tower[0] - i, tower[1] - j, radius, tower[2]);
                    quality += q;
                }
                if(quality>maxQuality){
                    maxQuality = quality;
                    xRes=i;
                    yRes=j;
                }
            }
        }
        return  new int[]{xRes,yRes};
    }

    private int getQuality(int x , int y ,int radius,int q){
        int zxz = x*x+y*y;
        if(radius*radius>=zxz){
            double d = Math.sqrt(zxz);
            return (int)Math.floor(q/(1+d));
        }else {
            return 0;
        }
    }
}