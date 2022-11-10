package leetcode.leetcode141;

//https://leetcode.cn/problems/linked-list-cycle/description/
//141. 环形链表
//easy
public class Solution {
    //快慢指针
    public boolean hasCycle(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while(l1!=null&&l1.next!=null){
            l1=l1.next.next;
            l2=l2.next;
            if(l1==l2){
                return true;
            }
        }
        return false;
    }
}
