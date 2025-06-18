class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ret = new int[nums.length / 3][3];
        
        Arrays.sort(nums);

        int n = 0;                              //for indexing in nums

        for(int i = 0; i < ret.length; i++){
            for(int j = 0; j < 3; j++){
                ret[i][j] = nums[n++];
            }
            if(ret[i][2] - ret[i][0] > k){
                return new int[0][0];
            }
        }

        return ret;
    }
}