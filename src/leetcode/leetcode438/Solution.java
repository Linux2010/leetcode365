package leetcode.leetcode438;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Solution {

    //
    public List<Integer> findAnagrams(String s, String p) {
        char[] charArray = p.toCharArray();
        HashSet<Character> charSet = new HashSet<>();
        for (char c : charArray) {
            charSet.add(c);
        }
        List<Integer> ans = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i <s.length(); i++) {

        }
        return ans;
    }
}
