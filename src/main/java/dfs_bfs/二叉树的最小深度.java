package dfs_bfs;

import entity.TreeNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/22
 */
public class 二叉树的最小深度 {

    public int minDepth(TreeNode root) {
        if(root==null)return 0;

        if(root.left==null&&root.right==null)return 1;

        int _minDepth = Integer.MAX_VALUE;
        if(root.right!=null){
            _minDepth= Math.min(minDepth(root.right),_minDepth);
        }
        if(root.left!=null){
            _minDepth= Math.min(minDepth(root.left),_minDepth);
        }
        return _minDepth+1;
    }
}
