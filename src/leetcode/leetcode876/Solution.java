package leetcode.leetcode876;


import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//876. 链表的中间结点
public class Solution {
    public ListNode middleNode(ListNode head) {
        //1,创建hashmap，i-head.val
        //2，取得中间数 get hashmap
        HashMap<Integer, ListNode> map = new HashMap<Integer,ListNode>();
        int i =1;
        map.put(i,head);
        while (head.next!=null){
            map.put(++i,head.next);
            head=head.next;
        }
        int k =1+i/2;
        return map.get(k);
    }

    public static void main(String[] args) {
        System.out.println(9/2+1);
    }
}