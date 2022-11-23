package leetcode.leetcode6;

//6
public class Solution {

    //模拟方法
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        Character[][] chars = new Character[numRows][s.length()];
        int rowIndex = 0,colIndex = 0;
        StringBuilder res = new StringBuilder();
        //up,down
        int[][] direction = new int[][]{{1,0},{-1,1}};
        int[] nowDir = direction[0];
        for (int i = 0; i < s.length(); i++) {
            if(rowIndex == 0){
                nowDir = direction[0];
            }
            if(rowIndex == numRows-1){
                nowDir = direction[1];
            }
            chars[rowIndex][colIndex]=s.charAt(i);
            rowIndex+=nowDir[0];
            colIndex+=nowDir[1];
        }
        //get first row char
        for (int i = 0; i < chars.length; i++) {
            for (Character c : chars[i]) {
                if(c!=null) res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        new Solution().convert("AB",1);
    }

}
