class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for(int i = 0; i < nums.size();){
            if (checkIncreasing(nums, i, k) && checkIncreasing(nums, i + k, k)) {
                return true;
            } 
            else {
                i++;
            }
        }
        return false;
    }

    public static boolean checkIncreasing(List<Integer> nums, int left, int k){
        if(left + k > nums.size())
            return false;
        for(int i = left + 1; i < left + k; i++){
            if(nums.get(i - 1) >= nums.get(i))
                return false;
        }
        return true;
    }
}