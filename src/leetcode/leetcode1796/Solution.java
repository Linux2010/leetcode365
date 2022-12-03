package leetcode.leetcode1796;

import java.util.Arrays;

//1796. 字符串中第二大的数字
//easy
public class Solution {

    public int secondHighest(String s) {
        Integer[] arr = new Integer[10];
        Arrays.fill(arr, -1);
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                int index = Character.getNumericValue(s.charAt(i));
                arr[index]=index;
            }
        }
        Arrays.sort(arr, (a,b)-> b-a);
        return arr[1];
    }

    public static void main(String[] args) {
        Integer[] list = new Integer[]{8,3,4,9,5,2};
        //这个是从小到大排序
        Arrays.sort(list);
        Arrays.stream(list).forEach(System.out::print);

        System.out.println("\n--------------------------");

        list = new Integer[]{8,3,4,9,5,2};
        Arrays.stream(list).forEach(System.out::print);
        System.out.println();
        Arrays.sort(list,(a,b)->-a.compareTo(b));
        Arrays.stream(list).forEach(System.out::print);

        System.out.println("\n---------------------------------");

        list = new Integer[]{8,3,4,9,5,2};
        Arrays.stream(list).forEach(System.out::print);
        System.out.println();
        Arrays.sort(list,(a,b)->-Integer.compare(a,b));
        Arrays.stream(list).forEach(System.out::print);

        System.out.println("\n---------------------------------");

        list = new Integer[]{8,3,4,9,5,2};
        Arrays.stream(list).forEach(System.out::print);
        System.out.println();
        Arrays.sort(list,(a,b)->-(a-b));
        Arrays.stream(list).forEach(System.out::print);
        System.out.println("\n---------------------------------");
    }
}
