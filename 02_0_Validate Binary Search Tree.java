/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int last;
    boolean res ;
    public boolean isValidBST(TreeNode root) { 
        
         last = Integer.MIN_VALUE;
        res = true;
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        if(root == null) return ;
        dfs(root.left);
        visit(root);
        dfs(root.right);
    }
    public void visit(TreeNode root){
        if(root.val < last ) res = false;
        last = root.val;
    }
}
