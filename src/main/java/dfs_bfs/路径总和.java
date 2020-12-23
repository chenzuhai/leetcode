package dfs_bfs;

import entity.TreeNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/22
 */
public class 路径总和 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        if(sum-root.val==0&&(root.left==null&&root.right==null))return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
