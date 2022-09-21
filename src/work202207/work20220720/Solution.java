package work202207.work20220720;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            //用补数作为key
            map.put(target - nums[i],i);
        }
        return null;
    }

    //合并两个有序数组
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //1，冒泡排序
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
            for(int j = m+i;j>0;j--){
                if(nums1[j]<nums1[j-1]){
                    int tmp = nums1[j-1];
                    nums1[j-1] = nums1[j];
                    nums1[j]=tmp;
                }
            }
        }
    }

    //二分查找

    public int search(int[] nums, int target) {
        int l = 0,r = nums.length-1;
        while (l <= r){
            int  res  = (r-l)/2+l;
            int num = nums[res];
            if(num==target){
                return res;
            }else if (num>target){
                r = res -1;
            } else {
                l = res +1;
            }
        }
        return  -1;

    }

}
