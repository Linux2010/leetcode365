package leetcode.leetcode817;

//817. 链表组件
//https://leetcode.cn/problems/linked-list-components/

import java.util.HashMap;

public class Solution {
    public int numComponents(ListNode head, int[] nums) {

        int res = 0;
        boolean offOn = false;
        HashMap<Integer, Object> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],null);
        }
        while (head!=null){
            if(!map.containsKey(head.val)&&offOn){
                //没找到，并且offOn开着，计数,关闭开关
                res++;
                offOn=false;
            }else if (map.containsKey(head.val)&&!offOn){
                //找到了，并且offOn关着，打开开关
                offOn=true;
            }
            head=head.next;
        }

        return offOn?res+1:res;
    }
}
