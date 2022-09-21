package work202207.work20220707;

import java.util.Stack;

/**
 * 判断执行
 */
public class MainTest {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();


        // ||由左到右，可以不全部执行。
        // && 由左到右，需要全部执行。
        if(stack.isEmpty()||stack.pop()=='c'){
            System.out.printf("true");
        }


    }
}
