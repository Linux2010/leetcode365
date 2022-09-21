package work202207.work20220719;

import java.util.ArrayList;
import java.util.List;

public  class MyCalendarTwo {

    private List<int[]> list1 ;
    private List<int[]> list2 ;
    public MyCalendarTwo() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        //1,先比较list2，如果涵盖 返回false
        //2，比较list1，如果涵盖 放入list2，如果不涵盖放入list1
        for (int[] arr : list2) {
            int left = arr[0],right=arr[1];
            if(left<end&&start<right){
                return false;
            }
        }
        for (int[] arr:list1){
            int left = arr[0],right=arr[1];
            if(left<end&&start<right){
                list2.add(new int[]{Math.max(left,start),Math.max(right,end)});
            }
        }
        list1.add(new int[]{start,end});
        return true;
    }

    public static void main(String[] args) {
        MyCalendarTwo obj = new MyCalendarTwo();
        assert obj.book(10,20);
        assert obj.book(10,20);
        assert obj.book(10,20);
        assert obj.book(10,20);

    }
}
