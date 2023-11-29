package leetcode.leetcode2336;

import java.util.*;

public class SmallestInfiniteSet {

    private static SortedSet<Integer> set = null;

    public SmallestInfiniteSet() {
        if(set==null) set = new TreeSet<Integer>();
        for (int i = 1; i <= 1000; i++) {
            set.add(i);
        }
    }

    public int popSmallest() {
        int res = set.first();
        set.remove(res);
        return res;
    }

    public void addBack(int num) {
        set.add(num);
    }

    public static void main(String[] args) {
        SmallestInfiniteSet set1 = new SmallestInfiniteSet();
        set1.addBack(2);
        System.out.println(set1.popSmallest());
        System.out.println(set1.popSmallest());
        System.out.println(set1.popSmallest());
        set1.addBack(1);
        System.out.println(set1.popSmallest());
        System.out.println(set1.popSmallest());
        System.out.println(set1.popSmallest());
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */