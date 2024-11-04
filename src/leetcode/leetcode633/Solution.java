package leetcode.leetcode633;

public class Solution {

    public boolean judgeSquareSum(int c) {
        for (int a = 0; a*a < c/2 ; a++) {
           int b = (int) Math.sqrt(c-a*a);
           if(a*a + b*b == c){
               return true;
           }
        }
        return false;
    }


    //优化算法， 双指针，left为a，right为b， 小于c a++， 大于c b--；

    public boolean judgeSquareSum_2(int c) {
        int a =0;
        int b = (int) Math.sqrt(c);
        while (a<=b){
            if(a*a +b*b ==c ){
                return true;
            }
            if(a*a + b*b >c){
                b--;
            }else {
                a--;
            }
        }
        return false;
    }

}
