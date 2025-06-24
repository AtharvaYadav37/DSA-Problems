class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> indexes = new HashSet<>();
        int len = nums.length;

        for(int i = 0; i < len; i++){
            if(nums[i] == key){
                for(int j = i; j <= i + k && j < len; j++){
                    indexes.add(j);
                }
                for(int j = i; j >= i - k && j >= 0; j--){
                    indexes.add(j);
                }
            }
        }

        // for(int i = len - 1; i >= 0; i--){
        //     if(nums[i] == key){
        //         for(int j = i; j >= i - k && j >= 0; j--){
        //             indexes.add(j);
        //         }
        //     }
        // }

        List<Integer> ret = new ArrayList<>(indexes);

        Collections.sort(ret);

        return ret;
    }
}