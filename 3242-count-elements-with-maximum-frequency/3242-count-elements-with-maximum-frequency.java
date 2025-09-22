class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;
        int maxFreq = 0;
        
        for(int i = 0; i < nums.length; i++){
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            int currFreq = freqMap.get(nums[i]);

            if(currFreq == maxFreq)
                count += currFreq;
            else if(currFreq > maxFreq){
                maxFreq = currFreq;
                count = currFreq;
            }
        }

        return count;
    }
}