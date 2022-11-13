package leetcode.leetcode791;

import java.util.Arrays;
import java.util.HashMap;

//791. 自定义字符串排序
//https://leetcode.cn/problems/custom-sort-string/
//medium
public class Solution {
    //order进行 hashmap，k为元素，v为序列号。
    //s中不再oder中的元素放到tmp中
    //s中匹配上的，可能有重复
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Integer, String> sMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i),i);
            sMap.put(i,"");
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int sort = map.get(s.charAt(i));
                sMap.put(sort,sMap.get(sort)+ s.charAt(i));
            }else {
                res.append(s.charAt(i));
            }
        }
        for (int i = 0; i < order.length(); i++) {
            res.append(sMap.get(i));
        }
        return res.toString();
    }

    //自定义排序的方法
    public String customSortStringArray(String order, String s) {
        int[] val = new int[26];
        for (int i = 0; i < order.length(); ++i) {
            val[order.charAt(i) - 'a'] = i + 1;
        }
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, (c0, c1) -> val[c0 - 'a'] - val[c1 - 'a']);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}
