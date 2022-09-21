package work202208.work03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
    //寻找数组的中心索引
    /**
     * 思路
     *
     * 记数组的全部元素之和为 \textit{total}total，当遍历到第 ii 个元素时，设其左侧元素之和为 \textit{sum}sum，则其右侧元素之和为 \textit{total}-\textit{nums}_i-\textit{sum}total−nums
     * i
     * ​
     *  −sum。左右侧元素相等即为 \textit{sum}=\textit{total}-\textit{nums}_i-\textit{sum}sum=total−nums
     * i
     * ​
     *  −sum，即 2\times\textit{sum}+\textit{nums}_i=\textit{total}2×sum+nums
     * i
     * ​
     *  =total。
     *
     * 当中心索引左侧或右侧没有元素时，即为零个项相加，这在数学上称作「空和」（\text{empty sum}empty sum）。在程序设计中我们约定「空和是零」。
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode.cn/problems/find-pivot-index/solution/xun-zhao-shu-zu-de-zhong-xin-suo-yin-by-gzjle/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int num = 0 ;
        for (int i = 0; i < nums.length; i++) {
           if(total == (num*2+nums[i] )){
             return i;
           }
           num += nums[i];
        }
        return -1;
    }


    // 合并两个有序链表

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();

        return res ;
    }



};