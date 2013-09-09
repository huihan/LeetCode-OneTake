If input is a stream ,this method will work better than the regular one
public class Solution {
    ListNode cur_node;
    public TreeNode sortedListToBST(ListNode head) { 
        cur_node = head; 
        TreeNode mid =sortedListToBST_DP(  1); 
        int cur_size = 2 ;
        while(cur_node != null){ 
          TreeNode tem =sortedListToBST_DP(  1);  
          TreeNode r = sortedListToBST_DP(  cur_size-1);
          tem.right = r;
          tem.left = mid;
          mid = tem;
          cur_size*=2;
        } 
        return mid;
    }
    public TreeNode sortedListToBST_DP(  int len){
      if(cur_node == null) return null;
      if(len == 0) return null;
      if(len == 1){
          TreeNode res = new TreeNode(cur_node.val);
          cur_node = cur_node.next;
          return res;
      }
      TreeNode l  = sortedListToBST_DP(len/2);
      if(cur_node == null) return l;
      TreeNode mid = new TreeNode(cur_node.val);
      cur_node = cur_node.next;
      TreeNode r  = sortedListToBST_DP(len -len/2 -1);
      mid.left = l;
      mid.right = r;
      return mid;
    }
}
