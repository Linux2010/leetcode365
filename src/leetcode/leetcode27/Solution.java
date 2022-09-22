package leetcode.leetcode27;

class Solution {
    //1,设置2个指针
    public int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        int i = 0;
        while ( i <= j){
            if(nums[i]==val&&nums[j]==val){
                j--;
            } else if (nums[i]==val) {
                int tmp = nums[j];
                nums[j]=nums[i];
                nums[i]=tmp;
                j--;
            } else {
                i++;
            }
        }
        return j;
    }
}