package work202208.work04;

//205. 同构字符串

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            Character k = s.charAt(i);
            Character v = t.charAt(i);
            if(map.containsKey(k)){
                if(map.containsValue(v)){
                    return false;
                }
                map.put(k,v);
                continue;
            }
            if(!v.equals(map.get(k))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Solution.isIsomorphic("badc","baba"));

    }
}
