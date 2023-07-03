package leetcode.leetcode445;

import java.util.ArrayList;
import java.util.List;

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
//445. Add Two Numbers II
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> arr = plus(linkToArray(l1), linkToArray(l2));
        return arrayToLink(arr);
    }

    private ArrayList<Integer> linkToArray(ListNode ln){
        ArrayList<Integer> list = new ArrayList<>();
        while (ln!=null){
            list.add(ln.val);
            ln=ln.next;
        }
        return list;
    }

    private ListNode arrayToLink(ArrayList<Integer>  arr){
        ListNode head = null;
        ListNode tail = null;
        for (int i = 0; i < arr.size(); i++) {
            ListNode node = new ListNode(arr.get(i));
            if (head==null) {
                head = node;
                tail = head;
            }
            else{
                tail.next=node;
                tail=node;
            }
        }
        return head;
    }

    private ArrayList<Integer>  plus(ArrayList<Integer>  l1,ArrayList<Integer>  l2){
        int i=l1.size()-1;
        int j=l2.size()-1;
        ArrayList<Integer> res = new ArrayList<>(l1.size() >= l2.size() ? l1 : l2);
        int jw = 0;
        int k = res.size()-1;
        while (i>=0||j>=0){
            int sum;
            if(i>=0&&j>=0){
                sum = jw + l1.get(i) + l2.get(j);
            } else {
                sum = jw + res.get(k);
            }
            jw = sum/10;
            res.set(k,sum%10);
            i--;j--;k--;
        }
        if(jw==1){
            ArrayList<Integer> new_res = new ArrayList<>();
            new_res.add(1);
            new_res.addAll(res);
            return new_res;
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Solution solution = new Solution();
        ListNode ln = solution.arrayToLink(list);
        ArrayList<Integer> list1 = solution.linkToArray(ln);
        list1.forEach(System.out::println);
    }

}