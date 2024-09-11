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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = new ListNode(0, null);
        ListNode p = a;
        int c = 0;
        while(l1 != null || l2 != null || c != 0){
            int sum = c;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            c = sum / 10;
            p.next = new ListNode(sum % 10, null);
            p = p.next;
        }
        return a.next;
    }
}