class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){
            minHeap.add(nums[i]);
        }

        for(int i = 0; i < nums.length - k; i++){
            int n = minHeap.poll();
        }

        return minHeap.poll();
    }
}