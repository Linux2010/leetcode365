package leetcode.leetcode1523;

/**
 * 2022-09-14
 * 1523. 在区间范围内统计奇数数目
 */
public class LeetCode1523 {

    /**
     *
     * 给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。
     *
     * 输入：low = 3, high = 7
     * 输出：3
     * 解释：3 到 7 之间奇数数字为 [3,5,7] 。
     *
     * 输入：low = 8, high = 10
     * 输出：1
     * 解释：8 到 10 之间奇数数字为 [9] 。
     *
     * 0 <= low <= high <= 10^9
     *
     * @param low
     * @param high
     * @return
     */
    public int countOdds(int low, int high) {
        //1, low%2 =0 +1 +2   low%=1 +2
        //思路：找到flag的为奇数的起始位，然后每次+2，直到大于high
        //该方法可以找到具体哪些奇数，但题目只要求个数，可以进行优化
        int flag = low-low%2 +1;
        int i = 0;
        while (flag<=high){
            i++;
            flag+=2;
        }
        return i;
    }

    public int countOdds1(int low, int high) {
        //1, low%2 =0 +1 +2   low%=1 +2
        int flag = low-low%2 +1;
        int i = 0;
        while (flag<=high){
            i++;
            flag+=2;
        }
        return i;
    }

}
