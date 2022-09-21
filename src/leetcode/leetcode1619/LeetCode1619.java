package leetcode.leetcode1619;

import java.util.Arrays;

//1619. 删除某些元素后的数组均值
//https://leetcode.cn/problems/mean-of-array-after-removing-some-elements/
public class LeetCode1619 {


    /**
     *
     * @param arr
     * @return
     */
    public double trimMean(int[] arr) {

        //排序
        Arrays.sort(arr);
        int offset =  arr.length/20;
        int res = 0 ;
        for (int i = offset; i <arr.length-offset; i++) {
            res +=arr[i];
        }
        return (double) res/(arr.length-offset*2);

    }
}
