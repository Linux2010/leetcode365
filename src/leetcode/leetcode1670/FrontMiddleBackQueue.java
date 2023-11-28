package leetcode.leetcode1670;

import java.util.LinkedList;

class FrontMiddleBackQueue {

    

    private static LinkedList  list = null;
    public FrontMiddleBackQueue() {
        list = new LinkedList<Integer>();
    }
    
    public void pushFront(int val) {
        list.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        list.add(list.size()/2,val);
    }
    
    public void pushBack(int val) {
        list.addLast(val);
    }
    
    public int popFront() {
        if (list.isEmpty()) return -1;
        return (int) list.removeFirst();

    }
    
    public int popMiddle() {
        if (list.isEmpty()) return -1;
        int index = (list.size()+1) / 2 - 1;
        return (int) list.remove(index);
    }
    
    public int popBack() {
        if (list.isEmpty()) return -1;
        return (int)list.removeLast();
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */