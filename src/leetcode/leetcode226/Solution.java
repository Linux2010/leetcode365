package leetcode.leetcode226;

//https://leetcode.cn/problems/invert-binary-tree/description/
//226. 翻转二叉树
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root ==null){
            return null;
        }
        //上层交换
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        //反转左边子节点
        invertTree(root.left);
        //反转右边子节点
        invertTree(root.right);

        return root;
    }
}
