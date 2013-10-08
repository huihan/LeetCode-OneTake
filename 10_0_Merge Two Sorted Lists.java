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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
       if(l1.val > l2.val) return mergeTwoLists(l2,l1);
       ListNode head = l1 , pre = head;
       while(l1!= null && l2!=null){
           if(l1.val<=l2.val){
               pre = l1;
               l1 = l1.next;
               continue;
           } 
           pre.next = l2;
           pre = l2;
           l2 = l2.next;
           pre.next = l1; 
       }
       if(l1  == null && l2!=null) pre.next = l2;
       return head;
    }
}
