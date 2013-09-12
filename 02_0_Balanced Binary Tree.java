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
       if(get_Depth_Keep_Balanced(root )<0 ) return false;
       return true;
    }
    public int get_Depth_Keep_Balanced(TreeNode root){
        
       if(root == null) return 0;
       if(root.left == null && root.right == null) return 1; 
       
       int l = get_Depth_Keep_Balanced(root.left);
       int r = get_Depth_Keep_Balanced(root.right); 
       if(l<0||r<0||l-r>1||l-r<-1) return -1;
       return 1+Math.max(l,r);
    }
}
