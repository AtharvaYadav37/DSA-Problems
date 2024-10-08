/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        int n = head.val;
        head = new ListNode(1000, head);

        ListNode curr = head;
        ListNode prev = head;
        while(curr != null && curr.next!= null){
            if(curr.val != curr.next.val)
                prev = curr;
            else{
                while(curr.next != null && curr.val == curr.next.val)
                    curr = curr.next;
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return head.next;
    }
}