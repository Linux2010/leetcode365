package leetcode.leetcode1253;

import java.util.ArrayList;
import java.util.List;

// 1253. 重构 2 行二进制矩阵
public class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int sum = 0;
        for (int i : colsum) {
            sum+=i;
        }
        if(upper+lower!=sum)return res;
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int j = colsum.length;
        while (i<j){
            if(colsum[i]==2){
                upper --;
                lower --;
                list.add(1);
                list2.add(1);
            } else if (colsum[i]==1) {
                if(upper>lower){
                    list.add(1);
                    list2.add(0);
                    upper --;
                }else {
                    list.add(0);
                    list2.add(1);
                    lower --;
                }
            }else {
                list.add(0);
                list2.add(0);
            }
            i++;
            if(upper<0||lower<0){
                return new ArrayList<>();
            }
        }
        res.add(list);
        res.add(list2);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,0};
        System.out.println(new Solution().reconstructMatrix(4,2,arr));

    }
}
