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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        for(ListNode p = head; p != null; p = p.next)
            ++size;

        if(size <= k){
            ListNode[] splitted = new ListNode[k];
            int i = 0;
            for(ListNode p = head; p != null; p = p.next){
                splitted[i] = new ListNode(p.val);
                i++;
            }
            for(; i < k; i++)
                splitted[i] = null;
            return splitted;
        }
        
        ListNode[] splitted = new ListNode[k];
        int quotient = size / k;
        int remainder = size % k;

        for(int i = 0; i < k; i++){
            ListNode q = head;
            for(int j = 1; j < quotient; j++)
                head = head.next;
            if(remainder > 0){
                head = head.next;
                remainder--;
            }
            ListNode r = head;
            head = head.next;
            r.next = null;
            splitted[i] = q;
        }

        return splitted;
    }
}