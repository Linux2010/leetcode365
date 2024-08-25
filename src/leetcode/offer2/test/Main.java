package leetcode.offer2.test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //使用贪心算法，尽量给最大的coin
        int input = 1000;
        int payMoney = 1024-input;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(16);
        list.add(4);
        list.add(1);
        int res = 0;
        for (Integer i : list) {
            res = res + payMoney/i;
            payMoney = payMoney%i;
        }
        System.out.println(res);

    }
}
