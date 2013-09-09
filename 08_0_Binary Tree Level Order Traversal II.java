 
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> qe = new LinkedList<TreeNode>();
        if(root == null) return res;
        qe.offer(root);
        while(!qe.isEmpty()){
          int len = qe.size();
          ArrayList<Integer> arr = new ArrayList<Integer>();
          for(int i = 0 ; i <len ; i++){
            TreeNode n = qe.poll();
            arr.add(n.val);
            if(n.left !=null)
              qe.offer(n.left);
            if(n.right !=null)
              qe.offer(n.right);
          }
          res.add(0,arr);
        }
        return res;
    }
}
