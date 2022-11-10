package leetcode.leetcode100;
//https://leetcode.cn/problems/same-tree/
//100. 相同的树
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] booleans = new boolean[]{true};
        deep(booleans,p,q);
        return booleans[0];

    }
    private void deep(boolean[] booleans,TreeNode p, TreeNode q){
        if (p==null&&q==null){
            return;
        } else if (p==null||q==null) {
            booleans[0] =false;
            return;
        } else if (p.val!=q.val) {
            booleans[0] =false;
            return;
        }
        deep(booleans,p.left,q.left);
        deep(booleans,p.right,q.right);
    }

}