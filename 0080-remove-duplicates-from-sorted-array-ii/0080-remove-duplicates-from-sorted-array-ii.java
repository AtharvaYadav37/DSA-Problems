class Solution {
    public int removeDuplicates(int[] nums) {
        int occurence = 1;
        int index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                occurence++;
            else
                occurence = 1;
            if(occurence <= 2){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}