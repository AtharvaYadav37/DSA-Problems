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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] a = new int[m][n];
        
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index */
        int k = 0, l = 0;
        ListNode p = head;
        while (k < m && l < n) {
            /* Print the first row from the remaining
          rows */
            for (int i = l; i < n; ++i) {
                a[k][i] = nullCheck(p);
                if(p != null)
                    p = p.next;
            }
 
            k++;
 
            /* Print the last column from the remaining
          columns */
            for (int i = k; i < m; ++i) {
                a[i][n - 1] = nullCheck(p);
                if(p != null)
                    p = p.next;
            }
            n--;
 
            /* Print the last row from the remaining
           rows */
            if (k < m) {
                for (int i = n - 1; i >= l; --i) {
                    a[m - 1][i] = nullCheck(p);
                    if(p != null)
                        p = p.next;
                }
                m--;
            }
 
            /* Print the first column from the remaining
           columns */
            if (l < n) {
                for (int i = m - 1; i >= k; --i) {
                    a[i][l] = nullCheck(p);
                    if(p != null)
                        p = p.next;
                }
                l++;
            }
        }
        return a;
    }

    public int nullCheck(ListNode q){
        if(q != null)
            return q.val;
        return -1;
    }
}