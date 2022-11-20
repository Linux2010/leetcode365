package leetcode.leetcode94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//https://leetcode.cn/problems/binary-tree-inorder-traversal/submissions/335492219/
//94. 二叉树的中序遍历

//首先我们需要了解什么是二叉树的中序遍历：按照访问左子树——根节点——右子树的方式遍历这棵树，
// 而在访问左子树或者右子树的时候我们按照同样的方式遍历，直到遍历完整棵树。
// 因此整个遍历过程天然具有递归的性质，我们可以直接用递归函数来模拟这一过程。

public class Solution {

    //递归方式
    public List<Integer> inorderTraversal_deep(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        deep(list,root);
        return list;
    }
    private void deep( ArrayList<Integer> list,TreeNode node){
        if(node==null){
            return;
        }
        deep(list,node.left);
        list.add(node.val);
        deep(list,node.right);
    }

    //栈方式
    public List<Integer> inorderTraversal_stack(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null||!stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur=cur.left;
            }else{
                cur=stack.pop();
                list.add(cur.val);
                cur=cur.right;
            }
        }
        return list;
    }
    //2022-11-10 ，递归方法加强联系
    public List<Integer> inorderTraversal_deep2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        deep2(list,root);
        return list;
    }
    private void deep2(List<Integer> list , TreeNode node){
        if(node ==null){
            return;
        }
        deep2(list,node.left);
        list.add(node.val);
        deep2(list,node.right);
    }



}
