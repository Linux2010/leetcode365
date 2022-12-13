package leetcode.leetcode1832;

import java.util.HashSet;
//https://leetcode.cn/problems/check-if-the-sentence-is-pangram/
//1832. 判断句子是否为全字母句
class Solution {
    public boolean checkIfPangram(String sentence) {
        var characters = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            if(!characters.contains(sentence.charAt(i))){
                characters.add(sentence.charAt(i));
                if(characters.size()==26) return true;
            }
        }
        return false;
    }
}