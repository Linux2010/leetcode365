//package leetcode.leetcode792;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
////https://leetcode.cn/problems/number-of-matching-subsequences/
////medium
////792. 匹配子序列的单词数
//public class Solution {
//
//    //个人思路：双指针
//    //结果超时
//    public int numMatchingSubseq(String s, String[] words) {
//        int res= 0;
//        for (String word : words) {
//            int sFlag = 0;
//            for (int j = 0; j < word.length(); j++,sFlag++) {
//                while (sFlag < s.length()&&s.charAt(sFlag) != word.charAt(j)) {
//                    sFlag++;
//                }
//            }
//            if(sFlag<=s.length()) res++;
//        }
//        return res;
//
//    }
//    //分桶做法
//    public int numMatchingSubseq1(String s, String[] words) {
//        int res= 0;
//        List<String>[] arrayLists = new ArrayList[26];
//        for (int i = 0; i < 26; i++) {
//            arrayLists[i]= new ArrayList<>();
//        }
//        for (String word : words) {
//            arrayLists[word.charAt(0) - 'a'].add(word);
//        }
//        for (int i = 0; i < s.length(); i++) {
//            var list = arrayLists[s.charAt(i) - 'a'];
//            for (int i1 = list.size()-1; i1 >=0; i1--) {
//                String tmp = list.get(i1).substring(1);
//                list.remove(i1);
//                if(!"".equals(tmp)){
//                    arrayLists[tmp.charAt(0)-'a'].add(tmp);
//                }else{
//                    res++;
//                }
//            }
//        }
//        return res;
//    }
//
//
//}
