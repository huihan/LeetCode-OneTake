我觉得我这个解法算是小有提升

public class Solution {
    ListNode cur_node;
    public TreeNode sortedListToBST(ListNode head) {
        ListNode tem = head;
        cur_node = head;
        int len = 0 ; 
        while(tem!=null){
          len++;
          tem=tem.next;
        }
        return sortedListToBST_DP(  len);
    }
    public TreeNode sortedListToBST_DP(  int len){
      if(len == 0) return null;
      if(len == 1){
          TreeNode res = new TreeNode(cur_node.val);
          cur_node = cur_node.next;
          return res;
      }
      TreeNode l  = sortedListToBST_DP(len/2);
      TreeNode mid = new TreeNode(cur_node.val);
      cur_node = cur_node.next;
      TreeNode r  = sortedListToBST_DP(len -len/2 -1);
      mid.left = l;
      mid.right = r;
      return mid;
    }
}
