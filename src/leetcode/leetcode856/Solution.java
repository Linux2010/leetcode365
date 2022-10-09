package leetcode.leetcode856;

import java.util.Stack;

//856. 括号的分数
//https://leetcode.cn/problems/score-of-parentheses/
public class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(0);
            }else {
                int v = stack.pop();
                int top = stack.pop()+Math.max(2*v,1);
                stack.push(top);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {

        int i = new Solution().scoreOfParentheses("(()(()(()()))(()())(()()()))");
        System.out.println(i);
    }
}
