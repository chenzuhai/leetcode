package dfs_bfs;

import entity.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/29 13:30
 */
public class 恢复二叉搜索树 {
    public void recoverTree(TreeNode root) {
        if(root==null)return;
        LinkedList<TreeNode> list = new LinkedList<>();
        inorder(root,list);
        TreeNode node1=null;
        TreeNode node2=null;

        for (int i = 0; i < list.toArray().length; i++) {
            System.out.println(list.get(i).val);
        }
        for (int i = 0; i < list.toArray().length-1; i++) {
            if(list.get(i).val>list.get(i+1).val){
                if(node1==null) {
                    node1 = list.get(i);
                    node2 = list.get(i+1);
                }else {
                    node2 = list.get(i);
                }
            }
        }
        Integer tmp = node1.val;
        node1.val = node2.val;
        node2.val = tmp;

    }
    public void inorder(TreeNode root, List<TreeNode> list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
}
