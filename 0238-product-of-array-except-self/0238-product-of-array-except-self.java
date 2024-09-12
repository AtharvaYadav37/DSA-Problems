class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c = 0;
        long product = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                product *= nums[i];
            else
                ++c;
        }
        for(int i = 0; i < nums.length; i++){
            if(c == 1 && nums[i] == 0)
                nums[i] = (int)(product);
            else if(c > 0)
                nums[i] = 0;
            else
                nums[i] = (int)(product)/nums[i];
        }
        return nums;
    }
}