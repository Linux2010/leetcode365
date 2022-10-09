package leetcode.leetcode1784;
//1784. 检查二进制字符串字段
//https://leetcode.cn/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
class Solution {
    public boolean checkOnesSegment(String s) {
        int i = 0 ;
        boolean flag = false;
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j)=='1'&&!flag){
                i+=1;
                flag = true;
            }else if(s.charAt(j)!='1'){
                flag = false;
            }
            if (i>1){
                return false;
            }
        }
        return true;
    }
    public boolean checkOnesSegment2(String s) {
        String[] strs = s.split("0");

        return  strs.length == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkOnesSegment2("1000"));

    }

}