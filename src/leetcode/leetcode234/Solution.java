package leetcode.leetcode234;


//234. 回文链表
//https://leetcode.cn/problems/palindrome-linked-list/

import leetcode.leetcode234.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();

        do{
            list.add(head.val);
            head = head.next;
        }while (head!=null);

        for (int i = 0,j=list.size()-1; i <=j ; i++,j--) {
            if(!Objects.equals(list.get(i), list.get(j))){
                return false;
            }
        }
        return true;
    }
}