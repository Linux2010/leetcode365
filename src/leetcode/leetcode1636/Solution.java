package leetcode.leetcode1636;

import java.util.*;
import java.util.stream.Collectors;

//1636. 按照频率将数组升序排序
class Solution {

    public int[] frequencySort(int[] nums) {
       List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Collections.sort(list,(a,b)->{
            int map1 = map.get(a);
            int map2 = map.get(b);
            return map1 != map2 ? map1 - map2 : b - a;
        });

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }


}
