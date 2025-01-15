package leetcode.leetcode3066;

import java.util.PriorityQueue;

public class Solution {

    public int minOperations(int[] nums, int k) {
        int ans = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (long num : nums) {
            queue.offer(num);
        }
        while (queue.peek() < k){
            long x = queue.poll();
            long y = queue.poll();
            queue.offer(x*2 +y);
            ans++;
        }
        return ans;
    }
}
