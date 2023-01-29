package leetcode.leetcode790;

class Solution {
    public int numTilings(int n) {
        //1,2,5,
        int i = n/3;
        int j = n%3;
        if(j==2) return (int) Math.pow(5,i)*j;
        else return (int) Math.pow(5,i);
    }
}