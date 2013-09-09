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
    ArrayList<ArrayList<Integer>> res ;
    public ArrayList<ArrayList<Integer>>  levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        res = new ArrayList<ArrayList<Integer>>();
        solve(root , 0);
         
        return res;
    } 
    public void solve(TreeNode root , int level){
        if(root == null) return;
        if(res.size()  <= level) res.add(new ArrayList<Integer>());
        res.get(level).add(root.val);
        solve(root.left , level+1);
        solve(root.right,level+1);
    }
}
