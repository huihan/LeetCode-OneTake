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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode lnode = new ListNode(0);
        ListNode lhead = lnode;
        ListNode rnode = new ListNode(0);
        ListNode rhead = rnode;
        while(head!=null){
            if(head.val < x) {
                lnode.next = new ListNode(head.val);
                lnode = lnode.next;
            }
            else {
                rnode.next = new ListNode(head.val);
                rnode = rnode.next;
            }
            head = head.next;
        }
        lnode.next = rhead.next;
        return lhead.next;
    }
}
