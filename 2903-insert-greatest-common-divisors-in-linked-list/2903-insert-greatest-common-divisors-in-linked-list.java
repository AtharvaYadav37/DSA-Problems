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
    public int GCD(int x, int y){
        int r=0, a, b;  
        a = (x > y) ? x : y; // a is greater number  
        b = (x < y) ? x : y; // b is smaller number  
        r = b;  
        while(a % b != 0)  
        {  
        r = a % b;  
        a = b;  
        b = r;  
        }  
        return r;  
    }
}