class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length;
        int maxDiff = Math.abs(nums[0] - nums[len - 1]); 
    
        for(int i = 0; i < len - 1; i++){
            int temp = Math.abs(nums[i] - nums[i + 1]);
            maxDiff = maxDiff < temp ? temp : maxDiff;
        }

        return maxDiff;
    }
}