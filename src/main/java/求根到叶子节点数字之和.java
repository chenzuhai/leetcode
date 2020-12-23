import entity.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/10/29
 */
public class 求根到叶子节点数字之和 {
    static LinkedList<Stack<Integer>> pathList = new LinkedList<>();

    public static int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        Stack<Integer> path = new Stack<>();
        //path.push(root.val);
        helper(root, path);
        int sum = 0;
        for (int i = 0; i < pathList.size(); i++) {
            Stack<Integer> stack = pathList.get(i);
            int len = stack.size();
            for (int j = 0; j < len; j++) {
                int num = stack.pop();
                sum += num * Math.pow(10,j);
            }
        }
        return sum;
    }

    public static void helper(TreeNode root, Stack<Integer> path) {
        if (root.left == null && root.right == null) {
            path.push(root.val);
            pathList.add(path);
            return;
        }
        path.push(root.val);

        Stack<Integer> next_path1  = (Stack<Integer>) path.clone();
        Stack<Integer> next_path2  = (Stack<Integer>) path.clone();
        if(root.left!=null)
            helper(root.left, next_path1);

        if(root.right!=null)
            helper(root.right, next_path2);

    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println(sumNumbers(treeNode1));
    }

    public int sumNumbers2(TreeNode root) {
        if(root==null)return 0;
        return helper2(root,0);
    }
    public int helper2(TreeNode root,int preSum){
        if(root==null)return 0;
        int sum = preSum*10 + root.val;
        if(root.left==null&&root.right==null){
            return sum;
        }else{
            return helper2(root.left,sum)+helper2(root.right,sum);
        }
    }
}
