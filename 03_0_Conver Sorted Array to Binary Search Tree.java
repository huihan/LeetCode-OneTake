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
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return sortedArrayToBST( num , 0 , num.length -1);
    }
    public TreeNode sortedArrayToBST(int[] num , int p , int q){
        int len = q - p ;
        if(len < 0) return null;
        TreeNode root = new TreeNode(0);
        if(len == 0 ) 
        {
          root.val = num[p];
          return root;
        }
        int mid = p + len /2;
        root.val = num[mid];
        root.left = sortedArrayToBST(num , p , mid -1);
        root.right = sortedArrayToBST(num , mid+1 , q);
        return root;
    }
}
