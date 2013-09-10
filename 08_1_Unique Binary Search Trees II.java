/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution { 
    public ArrayList<TreeNode> generateTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function 
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        res.add(null);
        if(n < 1) return res;
        
        return generateTrees(1,n);
    }
    public ArrayList<TreeNode> generateTrees(int start , int end){
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        if(start == end) {
            res.add(new TreeNode(start));
            return res;
        }
        if(start> end) {
            res.add(null);
            return res;
        }
        for(int i = start ; i<= end ; i++){
            ArrayList<TreeNode> left_set = generateTrees( start,i-1 );
            ArrayList<TreeNode> right_set = generateTrees( i+1 , end);
            for(int a = 0 ; a < left_set.size() ; a++)
                for(int b = 0 ; b < right_set.size() ; b++)
                {
                    TreeNode mid = new TreeNode(i);
                    mid.left = left_set.get(a);
                    mid.right = right_set.get(b);
                    res.add(mid);
                }
        }
        return res;
    }
}
