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
    ArrayList<ArrayList<Integer>> res;
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr  = new ArrayList<Integer>();
        if(root == null) return res;
    
        pathSum_DP(root,sum,arr);
        return res;
    }
    public void pathSum_DP(TreeNode  root , int sum , ArrayList<Integer> arr){
        if(root.left == null && root.right ==null) {
            arr.add(root.val);
            if(sum == root.val) res.add(new ArrayList<Integer>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        if(root.left!=null)
            pathSum_DP(root.left , sum - root.val , arr);
        
        if(root.right!=null)
            pathSum_DP(root.right , sum - root.val , arr);
        arr.remove(arr.size()-1);
    }
}
