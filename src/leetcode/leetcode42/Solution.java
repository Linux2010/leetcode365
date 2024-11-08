package leetcode.leetcode42;

public class Solution {


    //将height里的元素当成桶
    //1，计算左边桶高pre，左边桶依赖左边最高
    //2，计算右边桶高tail，右边桶依赖右边最高
    //3，计算桶容量：Math.min(pre[i],tail[i]) - height[i]
    //4，累加ans
    public int trap(int[] height) {
        int len = height.length;
        int[] pre = new int[len];
        int[] tail = new int[len];

        pre[0] = height[0];
        for (int i = 1; i < len; i++) {
            pre[i] = Math.max(pre[i-1],height[i]);
        }

        tail[len-1] = height[len-1];
        for (int i = len-2; i > 0; i--) {
            tail[i] = Math.max(tail[i+1],height[i]);
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans += Math.min(pre[i],tail[i]) - height[i];
        }
        return  ans;
    }

}
