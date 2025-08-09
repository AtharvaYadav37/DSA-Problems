class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length - k + 1];
        int i = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        for (int j = 0; j < nums.length; j++) {
            // Remove indices out of window
            while (!dq.isEmpty() && dq.peekFirst() <= j - k) {
                dq.pollFirst();
            }
            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) {
                dq.pollLast();
            }
            dq.offerLast(j);
            // Add to result when window is ready
            if (j >= k - 1) {
                arr[i++] = nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}