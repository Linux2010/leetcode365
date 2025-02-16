package leetcode.leetcode1299;

public class Solution {

    //https://leetcode.cn/problems/replace-elements-with-greatest-element-on-right-side/
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];
        arr[n-1] = -1;
        for (int i = n-2; i >=0 ; i--) {
            int tmp = arr[i];
            max = Math.max(max,arr[i]);
            arr[i] = tmp;
        }
        return arr;
    }
}