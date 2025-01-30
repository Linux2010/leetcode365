package leetcode.leetcode350;

import java.util.*;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] ints = new int[1001];
        for (int i : nums1) {
            ints[i]++;
        }
        for (int j : nums2) {
            if(ints[j] > 0){
                res.add(j);
                ints[j]--;
            }

        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
