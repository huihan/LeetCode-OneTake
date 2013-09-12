/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) { 
        if(head == null) return head;
        ListNode myHead = new ListNode(0);
        myHead.next = head;
        ListNode prehead = myHead;
        boolean duping = false;
        
        while(head != null){
            ListNode n = head.next;
            if(n == null) break;
            if(n.val == head.val) duping = true;
            while(duping){
                n = n.next;
                if(n == null) break;
                if(head.val == n.val) continue;
                head.val = n.val;
                head.next = n.next;
                break;
            }
            if(n == null) {
            prehead.next = null;
            break;
            }
            if(duping) 
                duping = false;
            else{
                prehead = head;
                head = head.next;
            }
            
        }
        return myHead.next ;
    }
}






