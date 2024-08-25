package leetcode.leetcode2660;

public class Solution {

    //2660. 保龄球游戏的获胜者
    public int isWinner(int[] player1, int[] player2) {
        int player1_value = 1;
        int player2_value = 1;
        int player1_res = 0;
        int player2_res = 0;
        for (int i = 0; i < player1.length; i++) {
            if(player1[i]==10){
                player1_value = 2;
            }
        }

        return  0;
    }
}
