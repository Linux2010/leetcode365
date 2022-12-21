package leetcode.leetcode1753;

import java.lang.reflect.Array;
import java.util.Arrays;



//假设1为最小值，2为中间值，3为最大值。找出如下规律：
//1+2<3 => 1+2
//1+2>=3 => 3 + (1+2-3)%2

//https://leetcode.cn/problems/maximum-score-from-removing-stones/discussion/
//1753. 移除石子的最大得分
class Solution {
    public int maximumScore(int a, int b, int c) {
        Integer[] arr = new Integer[]{a,b,c};
        Arrays.sort(arr);

        int sum =  arr[0]+arr[1];
        if(sum < arr[2]) return sum;
        else return arr[2] + (sum-arr[2])/2;
    }
}