package leetcode.leetcode7;
// https://leetcode.cn/problems/reverse-integer/description/
//7. 整数反转
public class Solution {
    //字符串反转写法，暴力解题
    public int reverse(int x) {
        StringBuilder sb;
        if (x>=0){
            sb= new StringBuilder(x+"");
        }else {
            sb = new StringBuilder(-x+"");
        }
        sb.reverse();
        try {
            if(x>0){
                return Integer.parseInt(sb.toString());
            }else {
                return -Integer.parseInt(sb.toString());
            }
        }catch (Exception e){
            return 0;
        }
    }
}
