public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;           // pointer for nums1
        int p2 = n - 1;           // pointer for nums2
        int p = m + n - 1;        // pointer for merged array (from end)

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }

        // If nums2 still has remaining elements
        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }
}
