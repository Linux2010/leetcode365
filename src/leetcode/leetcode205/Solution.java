package leetcode.leetcode205;

//205. 同构字符串

import java.util.HashMap;

public class Solution {
    //双hash表方案
    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            Character k = s.charAt(i);
            Character v = t.charAt(i);
            if(map1.containsKey(k)){
                if(v!=map1.get(k)){
                    return false;
                }
            }else {
                map1.put(k,v);
            }
            if(map2.containsKey(v)){
                if(k!=map2.get(v)){
                    return false;
                }
            }else {
                map2.put(v,k);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Solution.isIsomorphic("badc","baba"));

    }
}
