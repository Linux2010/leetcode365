package leetcode.leetcode3175;

public class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int ans = 0;
        int win = 0;
        for (int i = 1; i < skills.length&& win<k; i++) {
            if(skills[i]>skills[ans]){
                ans = i;
                win = 0;
            }
            win++;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] skills = new int[]{2,5,4};
        int k = 3;
        int res = new Solution().findWinningPlayer(skills,2);
        System.out.println(res);
    }
}
