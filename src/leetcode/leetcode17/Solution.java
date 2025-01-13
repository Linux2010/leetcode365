//package leetcode.leetcode17;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    final String[] MAPPING = new String[]{"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//    char[] arr;
//    char[] path;
//    List<String> ans = new ArrayList<>();
//
//    public List<String> letterCombinations(String digits) {
//        if(digits.isBlank()) return ans;
//        arr = digits.toCharArray();
//        path = new char[digits.length()];
//        dfs(0);
//        return ans;
//    }
//
//    private void dfs(int deep){
//        if(deep == arr.length){
//            ans.add(new String(path));
//            return;
//        }
//
//        int n = Integer.parseInt(arr[deep]+"");
//        for(char c: MAPPING[n].toCharArray()){
//            path[deep] = c;
//            dfs(deep+1);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<String> strings = new Solution().letterCombinations("2344");
//        strings.forEach(System.out::println);
//    }
//}
