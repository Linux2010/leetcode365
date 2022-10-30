package leetcode.leetcode784;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/letter-case-permutation/
//easy
//784. 字母大小写全排列
//给定一个字符串 s ，通过将字符串 s 中的每个字母转变大小写，我们可以获得一个新的字符串。
//返回 所有可能得到的字符串集合 。以 任意顺序 返回输出。
class Solution {
    //从左往右依次遍历字符，在队列中存储当前为已遍历过字符的字母大小全排列。例如当前字符串为:
    //
    //s=“abc"s = \text{``abc"}s=“abc"
    //
    //假设我们当前已经遍历到字符的第 222 个字符 ‘b’\text{`b'}‘b’ 时，则此时队列中已经存储的序列为:

    //思路：
    //，循环修改或添加list里的新元素，广度优先搜索
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> list = new ArrayList<>();
        if(Character.isLetter(s.charAt(0))){
            list.add((s.charAt(0)+"").toLowerCase());
            list.add((s.charAt(0)+"").toUpperCase());
        }else {
            list.add(s.charAt(0)+"");
        }
        for (int i = 1; i < s.length(); i++) {
            Character c = s.charAt(i);
            int len = list.size();
            for (int j = 0; j <len; j++) {
                String tmp = list.get(j);
                if(Character.isLetter(c)){
                    list.set(j, tmp+(c + "").toLowerCase());
                    list.add(tmp+(c+"").toUpperCase());
                }else {
                    list.set(j, tmp+c);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        new Solution().letterCasePermutation("a1b2");
    }
}