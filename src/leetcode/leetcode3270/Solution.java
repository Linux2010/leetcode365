package leetcode.leetcode3270;

public class Solution {


    public int generateKey(int num1, int num2, int num3) {
        int ans = 0;
        int[] t = new int[]{1,10,100,1000};
        for (int i : t) {
            ans += Math.min(num1%10,Math.min(num2%10,num3%10))*i;
            num1 /=10;
            num2 /=10;
            num3 /=10;
        }
        return ans;
    }
}
