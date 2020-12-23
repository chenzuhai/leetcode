import entity.TreeNode;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/61018
 */
public class 验证二叉搜索树 {

    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        return  helper(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean helper(TreeNode root,long up,long low){
        if(root==null)return true;

        if((long)root.val>=up||(long)root.val<=low)return false;

        return helper(root.left,root.val,low)&&helper(root.right,up,root.val);
    }
}
