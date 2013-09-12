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
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root  == null) return 0;
        if(root.left == null && root.right == null) return 1; 
        int res = Integer.MAX_VALUE;
        if(root.left!= null) res = Math.min(res, 1+minDepth(root.left));
        if(root.right !=null) res = Math.min(res, 1+minDepth(root.right));
        return res;
    }
}
