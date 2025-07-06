class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer, Integer> map2 = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for(int n : nums2){
            map2.put(n, map2.getOrDefault(n, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int key = nums2[index];
        map2.put(key, map2.get(key) - 1);
        nums2[index] += val;
        map2.put(nums2[index], map2.getOrDefault(nums2[index], 0) + 1);
    }
    
    public int count(int tot) {
        int combinations = 0;

        for(int n : nums1){
            combinations += map2.getOrDefault(tot - n, 0);
        }
        return combinations;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */