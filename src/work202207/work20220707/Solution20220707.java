package work202207.work20220707;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class Solution20220707 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    /**
     * 返回两个链表相加的头部
     */
    public ListNode add(ListNode l1, ListNode l2, int bit) {
        if (l1 == null && l2 == null && bit == 0) {
            return null;
        }
        int val = bit;
        if(l1!=null){
            val += l1.val;
            l1= l1.next;
        }
        if(l2!=null){
            val +=l2.val;
            l2=l2.next;
        }
        ListNode ln = new ListNode(val%10);
        ln.next=add(l1,l2,val/10);
        return ln;
    }
}