class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int len = nums.length;
        int i = 0;
        int j = 0;
        int lhs = 0;

        while(i < len){
            int val = nums[i];

            while(j < len && nums[j] - val <= 1){
                if(val + 1 == nums[j]){
                    lhs = Math.max(lhs, j - i + 1);
                }
                j++;
            }
            i++;
        }
        return lhs;
    }
}