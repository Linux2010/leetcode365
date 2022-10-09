package leetcode.leetcode202;

import java.util.HashMap;
import java.util.HashSet;

//202. Happy Number
// easy
//https://leetcode.cn/problems/happy-number/
public class Solution {

    //hashSet重复判断方法
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)){
            set.add(n);
            n = squareSum(n);
        }
        if(n==1){
            return true;
        }else {
            return false;
        }
    }
    private int squareSum(int m){
        int res = 0;
        while (m!=0){
            res = res + (m%10)*(m%10);
            m = m/10;
        }
        return res;
    }
}
