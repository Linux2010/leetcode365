package leetcode.leetcode1742;

//https://leetcode.cn/problems/maximum-number-of-balls-in-a-box/description/
//1742. 盒子中小球的最大数量
//easy
class Solution {

    //模拟方法
    public int countBalls(int lowLimit, int highLimit) {
        //本体
        int[] box = new int[46];
        int res =0;
        for (int i = lowLimit; i <=highLimit; i++) {
            int num = i;
            int index =0;
            while (num>0){
                index+=num%10;
                num = num/10;
            }
            box[index]+=1;
        }
        for (int i : box) res = Math.max(i,res);
        return res;
    }

}