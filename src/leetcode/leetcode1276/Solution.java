package leetcode.leetcode1276;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    // 4x+2y = tomatoSlices , x+y = cheeseSlices
    // x = cheeseSlices - y
    // 4*cheeseSlices -4y +2y = tomatoSlices
    // 4*cheeseSlices - 2y = tomatoSlices
    //
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> list = new ArrayList<>();
        int double_y= 4* cheeseSlices - tomatoSlices;
        //if(tomatoSlices==0&&cheeseSlices==0)
        if(double_y/2>=0&&double_y%2==0&&cheeseSlices>=double_y/2){
            list.add(cheeseSlices-double_y/2);
            list.add(double_y/2);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numOfBurgers(6,4));

    }

}
