package leetcode.leetcode35;

//35. 搜索插入位置
//easy
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        while (left<=right){
            int len = (right-left)/2+left;
            if(target>nums[len]){
                //查右半边
                left = len+1;
            } else if (target<nums[len]) {
                //查左半边
                right = len-1;
            }else {
                return len;
            }
        }
        return left;
    }
}
