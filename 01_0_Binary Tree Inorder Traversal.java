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
    ArrayList<Integer> res;
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        res  = new ArrayList<Integer>();
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        visit(root);
        dfs(root.right);
    }
    public void visit(TreeNode root){
        if(root == null) return;
        res.add(root.val);
    }
}
