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
    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        last = null;
        first = null;
        second = null;
        dfs(root);
        if(first!=null){
            int tem = first.val;
            first.val = second.val;
            second.val = tem;
        }
        return;
    }
    TreeNode last;
    TreeNode first;
    TreeNode second;
    void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        visit(root);
        dfs(root.right);
    }
    void visit(TreeNode root){
        if(last == null){
         last = root;
         return;
        }
        if(root.val<last.val){
            if(first == null){
                first = last;
                second = root;
            }
            else second  = root;
        }
        last = root;
    }
}
