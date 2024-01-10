package leetcode.leetcode167;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while (l<r){
            if(numbers[l]+numbers[r]==target){
                break;
            }
            if(numbers[l]+numbers[r]>target){
                r-=1;
            }else {
                l+=1;
            }
        }
        return new int[]{l+1,r+1};
    }
}
