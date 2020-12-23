package dfs_bfs;

import entity.TreeNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/22
 */
public class 二叉搜索树中第K小的元素 {

    int res;
    int _k;
    public int kthSmallest(TreeNode root, int k) {
        this._k=k;
        helper(root);
        return res;
    }
    public void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        this._k--;
        if(this._k==0)res = root.val;
        helper(root.right);
    }
}
