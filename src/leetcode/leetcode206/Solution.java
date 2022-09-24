package leetcode.leetcode206;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    //新建node节点，遍历原有链表。将原有node的赋值为新的节点。
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode last = new ListNode(head.val);
        while (head.next !=null){
            last = new ListNode(head.next.val,last);
            head = head.next;
        }
        return last;
    }
}
