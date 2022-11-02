package leetcode.leetcode4;

//4. 寻找两个正序数组的中位数
// https://leetcode.cn/problems/median-of-two-sorted-arrays/
public class Solution {

    //O(m+n) 解题方法
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] tmp = new int[len];
        int i = 0,j=0;
        for (int k=0; k < len;k++) {
            if(i>=nums1.length){
                tmp[k] = nums2[j];
                j++;
            } else if (j >= nums2.length) {
                tmp[k] = nums1[i];
                i++;
            } else if (nums1[i]>nums2[j]) {
                tmp[k] = nums2[j];
                j++;
            }else {
                tmp[k] = nums1[i];
                i++;
            }
        }
        if(len%2 ==0){
            return (tmp[len/2-1]+tmp[len/2])*0.5;
        }else {
            return tmp[len/2+len%2-1];
        }

    }

    public static void main(String[] args) {
        int[] n1 = new int[]{0,0,0,0,0};
        int[] n2 = new int[]{-1,0,0,0,0,0,1};
        new Solution().findMedianSortedArrays(n1,n2);
    }
}
