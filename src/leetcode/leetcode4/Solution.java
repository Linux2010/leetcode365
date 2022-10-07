package leetcode.leetcode4;

//4. 寻找两个正序数组的中位数
// https://leetcode.cn/problems/median-of-two-sorted-arrays/
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l1l2= l1+l2;
        if((l2+l1)%2 == 0){
            //偶数
            double res1=0,res2=0;
            int k1=(l2+l1)/2;
            int k2=(l2+l1)/2 +1;
            int i = 0;
            while (i<=k2){
                int n = 0,m=0;
                if(n<l1&&m<l2){
                    if(nums1[n]>=nums2[m]){
                        res2=nums1[n];
                        n++;
                    }else {
                        res2=nums2[m];
                        m++;
                    }
                } else if (n>=l1) {
                    res2=nums2[m];
                    m++;
                }else {
                    res2=nums1[n];
                    n++;
                }
                i++;
            }
            return (res1+res2)/2;
        }else {
            //奇数
            int res = 0;
            int k = (l2+l1)/2 +1;
            int i = 0;
            while (i<=k){
                int n = 0,m=0;
                if(n<l1&&m<l2){
                    if(nums1[n]>=nums2[m]){
                        res=nums1[n];
                        n++;
                    }else {
                        res=nums2[m];
                        m++;
                    }
                } else if (n>=l1) {
                    res=nums2[m];
                    m++;
                }else {
                    res=nums1[n];
                    n++;
                }
                i++;
            }
            return res;
        }


    }
}
