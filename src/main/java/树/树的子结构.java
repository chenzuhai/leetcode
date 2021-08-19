package 树;

import entity.TreeNode;

/**
 * @author Chen Zuhai
 * @Date 2021-05-15 19:04
 * @email: chenzuhai@induschain.cn
 */
public class 树的子结构 {
    public boolean isSub = false;
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null){
            return false;
        }
        dfs(A,B);
        return isSub;
    }
    public void dfs(TreeNode root, TreeNode B){
        if(root==null);
        if(root.left!=null)
            dfs(root.left,B);
        if(root.right!=null)
            dfs(root.right,B);
        if(helper(root,B))isSub =true;
    }
    public boolean helper(TreeNode A, TreeNode B){
        if(B==null||(A==null&&B==null))return true;
        if(A==null&&B!=null)return false;
        if(A.val != B.val)return false;
        return helper(A.left,B.left) || helper(A.right,B.right);
    }

}
