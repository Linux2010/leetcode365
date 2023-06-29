package leetcode.leetcode67;
//67. Add Binary
//Given two binary strings a and b, return their sum as a binary string.
public class Solution {

    //a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
    //b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
    public String addBinary_error(String a, String b) {
        long int_a = Integer.parseInt(a);
        long int_b = Integer.parseInt(b);
        long int_c = int_a+int_b;
        String s = String.valueOf(int_c);
        boolean jw_flag = false;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {

            switch (s.charAt(i)){
                case '2':
                    if(jw_flag)sb.insert(0,"1");
                    else sb.insert(0,"0");jw_flag=true;
                    break;
                case '1':
                    if (jw_flag)sb.insert(0,"0");
                    else sb.insert(0,"1");
                    break;
                case '0':
                    if(!jw_flag)sb.insert(0,"0");
                    else sb.insert(0,"1");jw_flag=false;
                    break;
            }
        }
        if(jw_flag) sb.insert(0,"1");
        return sb.toString();
    }
    public String addBinary(String a, String b) {
        int jw = 0;
        StringBuilder res = new StringBuilder();
        int i = a.length();
        int j = b.length();
        while (i>0 || j >0){
            int i1 = i>0?a.charAt(--i)-'0':0;
            int j1 = j>0?b.charAt(--j)-'0':0;
            int ij=i1+j1+jw;
            jw= ij/2;
            res.insert(0,ij%2);
        }
        if(jw==1) res.insert(0,"1");
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("1110110101","1110111011"));
    }


}
