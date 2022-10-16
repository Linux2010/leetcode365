package leetcode.leetcode125;

//https://leetcode.cn/problems/valid-palindrome/

//125. 验证回文串

class Solution {

    //双指针方法
    public boolean isPalindrome_double(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            while (s.charAt(left)<'A'||s.charAt(left)>'z'){
                left++;
            }
            while (s.charAt(right)<'A'||s.charAt(right)>'z'){
                right--;

            }
            if(!isEqual(s.charAt(left),s.charAt(right))){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
    boolean isEqual(char a,char b){
        return a == b || (a + 32) == b || a == (b + 32);
    }

    public static void main(String[] args) {
        new Solution().isPalindrome("A man, a plan, a canal: Panama");
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='A'&&c<='Z'){
                sb.append((char)(c+32));
            } else if (c>='a'&&c<='z') {
                sb.append(c);
            } else if (c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        if(sb.length()==0){
            return true;
        }
        if(sb.length()==1){
            return false;
        }
        int left =0;
        int right = sb.length()-1;
        while (left<right){
            if(sb.charAt(left)!=sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}