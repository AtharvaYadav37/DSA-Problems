class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i : nums)
            set.add(i);
        for(int i : nums){
            if(!set.contains(i - 1)){
                int c = 1;
                while(set.contains(i + 1)){
                    ++c;
                    ++i;
                }
                max = Math.max(c, max);
            }
        }
        return max;
    }
}