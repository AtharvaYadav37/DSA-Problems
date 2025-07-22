class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int max = -1;
        int l = 0;
        int r = 0;
        HashSet<Integer> set = new HashSet<>();
        
        while(r < nums.length){
            if(!set.contains(nums[r])){
                set.add(nums[r]);
                sum += nums[r];
                max = Math.max(max, sum);
                r++;
            }
            else{
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
        }

        return max;
    }
}