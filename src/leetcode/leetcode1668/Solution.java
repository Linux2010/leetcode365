package leetcode.leetcode1668;
//https://leetcode.cn/problems/maximum-repeating-substring/
//1668. 最大重复子字符串
class Solution {
    public int maxRepeating(String sequence, String word) {
        int len = word.length();
        int res =0;
        int tmpRes=0;
        int k =0;
        for (int i = 0; i < sequence.length(); i++) {
           if(!(sequence.charAt(i) == word.charAt(k))){
               //回退判断，若之前有匹配项，则下一次计算从匹配开始的第二位进行计算
               if(tmpRes!=0||k!=0){
                   i = i-tmpRes*len-k;
               }
               tmpRes =0;
               k=0;
           }else if (k==len-1) {
               tmpRes++;
               res = Math.max(res,tmpRes);
               k=0;
           }else {
               k++;
           }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));

    }


}