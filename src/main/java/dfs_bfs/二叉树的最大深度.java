package dfs_bfs;

import entity.TreeNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/22
 */
public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
