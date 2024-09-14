class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        for(int i : nums)
            max = max < i ? i : max;
        int c = 0;
        int t = 0;
        for(int i : nums){
            if(i != max){
                t = Math.max(t, c);
                c = 0;
            } else{
                ++c;
            }
        }
        t = Math.max(c, t);
        return t;
    }
}