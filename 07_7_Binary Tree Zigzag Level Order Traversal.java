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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        res = new ArrayList<ArrayList<Integer>>();
        solve(root , 0);
        for(int i = 1 ; i < res.size() ; i+=2){
            reverse(res.get(i));
        }
        return res;
    }
    public void reverse(ArrayList<Integer> arr){
        
        for(int p = 0 , q = arr.size()-1 ; p<q ; p++,q--){
            int tem = arr.get(p);
            arr.set(p,arr.get(q));
            arr.set(q,tem);
        }
    }
    public void solve(TreeNode root , int level){
        if(root == null) return;
        if(res.size()  <= level) res.add(new ArrayList<Integer>());
        res.get(level).add(root.val);
        solve(root.left , level+1);
        solve(root.right,level+1);
    }
}
