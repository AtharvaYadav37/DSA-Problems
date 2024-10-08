class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; ){
            if(nums[i] == nums[nums[i] - 1]){
                ++i;
            } else{
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for(int i = 0; i < nums.length; i++)
            if(nums[i] - 1 != i){
                arr[0] = (nums[i]);
                arr[1] = (i + 1);
                break;
            }

        return arr;
    }
}