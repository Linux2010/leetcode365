package leetcode.leetcode14;

//https://leetcode.cn/problems/longest-common-prefix/
//14. 最长公共前缀
//easy
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer res = new StringBuffer();
        boolean flag = false;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j =1; j < strs.length; j++) {
                if(strs[j].length()<=i){
                    flag=true;
                    break;
                }else if(strs[j].charAt(i)!=c){
                    flag=true;
                    break;
                }
            }
            //等于ture跳出循环
            if (flag){
                break;
            }
            res.append(c);
        }
        return res.toString();
    }
}