package leetcode.leetcode754;


//754. 到达终点数字
// https://leetcode.cn/problems/reach-a-number/description/
public class Solution {


    // https://leetcode.cn/problems/reach-a-number/solutions/1947300/by-muse-77-g0il/
    // 将任何数字由正变为负都会将总和减少2A，2A为偶数，所以在回退一步为最小原则的情况下，num-t需要为偶数，并且num要大于t
    public int reachNumber(int target) {
        int res = 0 ;
        int t = Math.abs(target);
        int num = 0;
        while (num<t||(num-t)%2!=0){
            num+=++res;
        }
        return res;
    }
}
