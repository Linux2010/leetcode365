package leetcode.leetcode283;

//283. 移动零
//easy
// https://leetcode.cn/problems/move-zeroes/
public class Solution {
    //快慢指针，快指针遍历，慢指针标记连续0的第一位置
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == 0){
                nums[index] = nums[i+1];
                nums[i+1] = 0;
            }
            if(nums[index]!=0){
                index++;
            }
        }
    }

    //优化判断条件
    public void moveZeroes_1(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int tmp = nums[index];
                nums[index] = nums[i];
                nums[i] = tmp;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,1,2,3};
        new Solution().moveZeroes_1(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
