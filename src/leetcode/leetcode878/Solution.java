package leetcode.leetcode878;

class Solution {
    static final int MOD = 1000000007;
    public int nthMagicalNumber(int n, int a, int b) {
        long lcm = a / gcd(a, b) * b;
        long left = 0;
        long right = Math.max(a,b)*n;
        return 0;

    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}