package 树;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/3/8 16:12
 */
public class 二叉树展开为链表 {
    public void flatten(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        preOrder(root,list);
        for (int i = 0; i < list.size(); i++) {
            TreeNode pre = list.get(i-1), cur = list.get(i);
            pre.left = null;
            pre.right = cur;
        }
    }

    public void preOrder(TreeNode root, List<TreeNode> list){
        if(root != null){
            list.add(root);
            preOrder(root.left,list);
            preOrder(root.right,list);
        }
    }
}
class 二叉树展开为链表2 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        flatten(right);
        root.right = right;
    }
}
class 二叉树展开为链表3 {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        TreeNode prev = null;
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(prev!=null){
                prev.left = null;
                prev.right = curr;
            }
            if(curr.right!=null){
                stack.push(curr.right);
            }
            if(curr.left!=null){
                stack.push(curr.left);
            }
            prev = curr;
        }


    }
}

























