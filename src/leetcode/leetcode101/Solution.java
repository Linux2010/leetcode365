package leetcode.leetcode101;

//https://leetcode.cn/problems/symmetric-tree/
//101. 对称二叉树
public class Solution {

    //1,创建2个二叉树，1个是中序遍历，1个是逆中序遍历，对比每个一个node
    public boolean isSymmetric(TreeNode root) {
        boolean[] b = new boolean[]{true};
        deep(b,root,root);
        return b[0];
    }
    private void deep(boolean[] b ,TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null){
            return;
        } else if (node1==null||node2==null) {
            b[0]=false;
            return;
        } else if (node1 == node2) {
            return;
        }
        deep(b,node1.left,node2.right);
        if (node1.val!= node2.val) {
            b[0]=false;
            return;
        }
        deep(b,node1.right,node2.left);
    }

}
