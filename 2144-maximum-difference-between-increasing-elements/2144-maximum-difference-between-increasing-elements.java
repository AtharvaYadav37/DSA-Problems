class Solution {
    public int maximumDifference(int[] nums) {
        int len = nums.length;
        int[] rightMax = new int[len];

        rightMax[len - 1] = nums[len - 1];
        for(int i = len - 2; i >= 0; i--){
            rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
        }

        int maxDiff = -1;

        for(int i = 0; i < len; i++){
            maxDiff = Math.max(maxDiff, rightMax[i] - nums[i]);
        }

        if(maxDiff == 0)
            return -1;
        return maxDiff;
    }
}