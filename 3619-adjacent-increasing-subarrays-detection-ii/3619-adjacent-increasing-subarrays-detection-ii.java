class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int count = 1;
        int precount = 1;
        int max = 0;

        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i - 1) < nums.get(i)){
                count++;
            }
            else{
                precount = count;
                count = 1;
            }
            max = Math.max(max, Math.min(precount, count));
            max = Math.max(max, count / 2);
        }

        return max;
    }
}