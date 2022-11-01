package leetcode.leetcode1662;

//1662. 检查两个字符串数组是否相等
//https://leetcode.cn/problems/check-if-two-string-arrays-are-equivalent/
//EASY
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer buffer = new StringBuffer();
        for (String word: word1) {
            buffer.append(word);
        }
        int i = 1;
        for (String word: word2) {
            int tmpEnd = i+word.length();
            if(tmpEnd>=buffer.length()){
                return false;
            }
            if(!word.equals(buffer.substring(i,i+word.length()))){
                return false;
            }
            i+=word.length();
        }
        return i == buffer.length();
    }
}
