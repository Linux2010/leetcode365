package leetcode.leetcode3222;

public class Solution {


    public String losingPlayer(int x, int y) {
        int i = Math.min(x,y/4);
        if(i%2==0){
            return "Bob";
        }else {
            return "Alice";
        }
    }

    //优化
    public String losingPlayer_2(int x, int y) {
        return Math.min(x,y/4)%2==0?"Bob":"Alice";
    }

    public static void main(String[] args) {
        String res = new Solution().losingPlayer_2(2,7);
        System.out.println(res);
    }
}
