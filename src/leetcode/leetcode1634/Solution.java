package leetcode.leetcode1634;

public class Solution {

    //error
    public PolyNode addPoly_error(PolyNode poly1, PolyNode poly2) {
        PolyNode node = new PolyNode();
        PolyNode res = node;
        while (poly1!=null||poly2!=null){
            if(poly1!=null&&poly2!=null){
                //判断哪个大，用哪个
                //如果相等，相加
                if(poly1.power== poly2.power){
                    node.power=poly1.power+poly2.power;
                    node.coefficient = poly1.coefficient+ poly2.coefficient;
                    poly1=poly1.next;
                    poly2=poly2.next;
                } else if (poly1.power>poly2.power) {
                    node.power=poly1.power;
                    node.coefficient=poly1.coefficient;
                    poly1=poly1.next;
                }else {
                    node.power=poly2.power;
                    node.coefficient=poly2.coefficient;
                    poly2=poly2.next;
                }
            } else if (poly1!=null) {
                //执行poly1
                node.power=poly1.power;
                node.coefficient=poly1.coefficient;
                poly1=poly1.next;
            }else {
                node.power=poly2.power;
                node.coefficient=poly2.coefficient;
                poly2=poly2.next;
            }
            node.next = new PolyNode();
            node = node.next;
        }
        node.next=null;
        return res;
    }

    public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {

        PolyNode res = new PolyNode();
        PolyNode r = res;

        while (poly1!=null||poly2!=null){
            if(poly1!=null&&poly2!=null){
                //判断哪个大，用哪个
                //如果相等，相加
                if(poly1.power== poly2.power){
                    poly1.power=poly1.power+poly2.power;
                    poly1.coefficient = poly1.coefficient+ poly2.coefficient;
                    if (poly1.coefficient != 0) {
                        res.next = poly1;
                    }
                    poly1=poly1.next;
                    poly2=poly2.next;
                } else if (poly1.power>poly2.power) {
                    res.next=poly1;
                    poly1=poly1.next;
                }else {
                    res.next=poly2;
                    poly2=poly2.next;
                }
            } else if (poly1!=null) {
                //执行poly1
                res.next=poly1;
                poly1=poly1.next;
            }else {
                res.next=poly2;
                poly2=poly2.next;
            }
            if(res.next!=null){
                res = res.next;
            }
        }
        return r.next;
    }



}

