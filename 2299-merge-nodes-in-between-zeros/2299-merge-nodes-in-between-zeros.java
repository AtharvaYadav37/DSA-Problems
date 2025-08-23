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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        int sum = 0;
        ListNode node = new ListNode(0, null);
        ListNode ptr = node;
        while(curr != null){
            if(curr.val == 0){
                ptr.next = new ListNode(sum, null);
                ptr = ptr.next;
                sum = 0;
            }
            sum += curr.val;
            curr = curr.next;
        }
        return node.next;
    }
}