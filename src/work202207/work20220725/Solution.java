package work202207.work20220725;

import java.util.*;

class Solution {


    /**
     * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/intersection-of-two-arrays-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums1
     * @param nums2
     * @return
     */

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums1){
            int value = map.getOrDefault(n, 0) + 1;
            map.put(n,value);
        }
        List<Integer> resList = new ArrayList<Integer>();
        for (int n : nums2){
            if(map.get(n)!=null&&map.get(n)>0){
                resList.add(n);
                map.put(n,map.get(n)-1);
            }
        }
        int[] res = Arrays.stream(resList.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        return res;
    }

    //动态规划
    public int maxProfit(int[] prices) {
        int res = 0 ;
        //0,1,2
        if(prices.length== 1 ){
            return Math.max(prices[0], res);
        }
        for (int i = 0; i <prices.length-1; i++) {
            int v =  prices[i+1] - prices[i];
            if(prices[i] + prices[i+1] >prices[i+1]){
                prices[i+1] = prices[i] + prices[i+1];
                res = prices[i+1];
            }
        }
        return  res;
    }
    //动态规划
    public int maxProfit2(int[] prices) {
        int res = 0 ,pre = prices[0];
        for (int i = 1; i <prices.length; i++) {
            pre = prices[i] - prices[i-1];


        }
        return  res;
    }


}
