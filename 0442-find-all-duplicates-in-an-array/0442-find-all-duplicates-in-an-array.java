class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        for(int i = 0; i < nums.length; ){
            if(nums[i] == nums[nums[i] - 1]){
                ++i;
            } else{
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
            if(nums[i] - 1 != i)
                arr.add(nums[i]);

        return arr;
    }
}