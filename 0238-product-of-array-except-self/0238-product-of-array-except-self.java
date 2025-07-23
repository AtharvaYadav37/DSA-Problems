class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] right = new int[len];

        right[len - 1] = nums[len - 1];

        for(int i = len - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i];
        }

        int[] ret = new int[len];
        ret[0] = right[1];

        int leftProd = nums[0];

        for(int i = 1; i < len - 1; i++){
            ret[i] = leftProd * right[i + 1];    
            leftProd *= nums[i];
        }
        ret[len - 1] = leftProd;

        return ret;
    }
}