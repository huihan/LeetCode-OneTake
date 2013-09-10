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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return solve(root)> 0;
    }
    public int solve(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int l = solve(root.left);
        int r = solve(root.right);
        if(l < 0) return -1;
        if(r < 0) return -1;       
        if(Math.abs(r-l) >1) return -1;
        return Math.max(r,l)+1;
    }
}
