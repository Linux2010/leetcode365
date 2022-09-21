package work202207.work20220707;

import java.util.Stack;

public class Solution20220707_1 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (char c : s.toCharArray()) {
                if(c=='{'){
                    stack.push('}');
                } else if (c=='[') {
                    stack.push(']');
                } else if (c=='(') {
                    stack.push(')');
                } else if (stack.isEmpty()||c!=stack.pop()) {
                    return false;
                }
            }
            return stack.isEmpty();

        }
    }
}
