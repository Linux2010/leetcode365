package leetcode.leetcode775;

//775. 全局倒置与局部倒置
//https://leetcode.cn/problems/global-and-local-inversions/
//medium
public class Solution {

    //false的充要条件：只要出现非相邻的两个元素前者大于后者。
    //1，尾部轮训，从倒数第三位开始
    //2，tmp取尾部最小值min
    public boolean isIdealPermutation(int[] nums) {
        int len = nums.length;
        int tmp = nums[len-1];
        for (int i = len-3; i >=0 ; i--) {
            if(nums[i]>tmp){
                return false;
            }
            tmp = Math.min(tmp ,nums[i+1]);
        }
        return true;
    }
}
