package leetcode.leetcode2315;
//2315. 统计星号
//https://leetcode.cn/problems/count-asterisks/
//EASY
public class Solution {
    public static void main(String[] args) {
        new Solution().countAsterisks("l|*e*et|c**o|*de|");

    }

    public int countAsterisks(String s) {
        int res = 0;
        boolean is_count = true;
        for (int i = 0; i < s.length(); i++) {
            if(124==s.charAt(i)){
                is_count = !is_count;
            }
            if(is_count&&42==s.charAt(i)){
                res++;
            }
        }
        return res;
    }
}
