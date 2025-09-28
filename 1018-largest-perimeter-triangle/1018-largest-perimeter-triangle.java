class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int len = nums.length;
        int maxArea = 0;
        for(int i = len - 1; i >= 2; i--){
            if(nums[i - 2] + nums[i - 1] > nums[i])
                maxArea = Math.max(maxArea, nums[i - 2] + nums[i - 1] + nums[i]);
        }

        return maxArea;
    }
}