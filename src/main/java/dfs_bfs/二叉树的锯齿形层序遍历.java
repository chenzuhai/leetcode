package dfs_bfs;

import entity.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/23 16:30
 */
public class 二叉树的锯齿形层序遍历 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) {
            return lists;
        }
        LinkedList<TreeNode> treeNodeList = new LinkedList<>();

        treeNodeList.add(root);
        boolean flag = true;
        while (!treeNodeList.isEmpty()) {
            int size = treeNodeList.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = treeNodeList.removeFirst();
                if(flag) {
                    temp.addLast(treeNode.val);
                }else {
                    temp.addFirst(treeNode.val);
                }

                if (treeNode.left != null) {
                    treeNodeList.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    treeNodeList.add(treeNode.right);
                }

            }
            flag = !flag;
            lists.add(temp);
        }
        return lists;
    }

}

