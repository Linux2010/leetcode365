package leetcode.leetcode1106;

import java.util.Stack;

//https://leetcode.cn/problems/parsing-a-boolean-expression/
//1106. 解析布尔表达式
class Solution {
    //stack
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c==','){
                continue;
            }
            int t=0,f=0;
            if(c!=')'){
                stack.push(c);
            }else {
                while (stack.peek()!='('){
                    if(stack.pop()=='f'){
                        f++;
                    }else {
                        t++;
                    }
                }
                stack.pop();
                switch (stack.pop()){
                    case '!':
                        stack.push(f == 1 ? 't' : 'f');
                        break;
                    case '&':
                        Character cc = f>0?'f':'t';
                        stack.push(cc);
                        break;
                    case '|':
                        Character ccc = t>0?'t':'f';
                        stack.push(ccc);
                    default:
                }
            }
        }
        return stack.pop() == 't';
    }

    public static void main(String[] args) {
        System.out.println(new Solution().parseBoolExpr("&(t,f)"));

    }
}