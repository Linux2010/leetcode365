package leetcode.leetcode94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//https://leetcode.cn/problems/binary-tree-inorder-traversal/submissions/335492219/
//94. 二叉树的中序遍历
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

}
