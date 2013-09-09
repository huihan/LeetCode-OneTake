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
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function 
        if(root == null) return ;
        TreeNode rnode = flatten_DP(root);
    }
    public TreeNode flatten_DP(TreeNode root){
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        TreeNode rnode = root.right;
        if(root.left == null){
             return flatten_DP(rnode);
        }
        root.right = root.left;
        root.left = null;
        TreeNode rend = flatten_DP(root.right);
        rend.right = rnode;
        if(rnode !=null)
            return flatten_DP(rnode);
        return rend;
    }
}
