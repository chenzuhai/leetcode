import entity.TreeNode;

import java.util.LinkedList;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/19
 */
public class 对称二叉树 {
    public boolean 递归(TreeNode root) {
        if(root==null)return true;
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode left, TreeNode right){
        if(left==null&&right==null)return true;
        if(left==null||right==null)return false;

        return left.val==right.val && helper(left.left,right.right) && helper(right.left,left.right);
    }

    public boolean 迭代(TreeNode root) {
        if(root==null)return true;
        LinkedList<TreeNode> list= new LinkedList<>();
        list.add(root.left);
        list.add(root.right);
        while(!list.isEmpty()){
            TreeNode left = list.pollFirst();
            TreeNode right = list.pollFirst();
            if(left==null||right==null){
                return false;
            }
            if(left.val!=right.val)return false;

            list.add(left.right);
            list.add(right.left);
            list.add(left.left);
            list.add(right.right);
        }
        return true;
    }
}
