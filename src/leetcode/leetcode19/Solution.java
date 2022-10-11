package leetcode.leetcode19;

import java.util.ArrayList;

//https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
//19. 删除链表的倒数第 N 个结点

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //创建一个list存储所有节点
        //取list.size-n，删除该节点
        //删除方式 list.size-1-n的next = list.size+1-n
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode tmpNode = head;
        while (tmpNode!=null){
            list.add(tmpNode);
            tmpNode = tmpNode.next;
        }
        int size=list.size();
        if(size==1){
            head=null;
        }else if(n == 1){
            list.get(size-1-1).next=null;
        } else if (n==size) {
            return head.next;
        } else {
            list.get(size-1-n).next = list.get(size+1-n);
        }
        return head;
    }
}