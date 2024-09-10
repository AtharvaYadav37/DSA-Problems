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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(!(head.next == null)){
            ListNode p = head;
            ListNode q = head;

            while(p.next != null){
                q = p;
                p = p.next;
                q.next = new ListNode(GCD(q.val, p.val));
                q.next.next = p;
            }
        }
        return head;
    }
    public int GCD(int n, int m){
        if(n == 1 || m == 1)
            return 1;
        int a = Math.min(n, m);
        for(; a > 0; a--)
            if(m % a == 0 && n % a == 0)
                return a;
        return 1;
    }
}