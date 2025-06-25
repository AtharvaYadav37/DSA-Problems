// class Solution {
//     public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
//         HashSet<Integer> indexes = new HashSet<>();
//         int len = nums.length;

//         for(int i = 0; i < len; i++){
//             if(nums[i] == key){
//                 for(int j = i; j <= i + k && j < len; j++){
//                     indexes.add(j);
//                 }
//                 for(int j = i; j >= i - k && j >= 0; j--){
//                     indexes.add(j);
//                 }
//             }
//         }

//         List<Integer> ret = new ArrayList<>(indexes);

//         Collections.sort(ret);

//         return ret;
//     }
// }

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int count = 0;
        boolean[] bool = new boolean[nums.length];
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            if(nums[i]==key){
                for(int j = i-k; j < i+k+1 && j < nums.length; j++){
                    if(j < 0){
                        continue;
                    }
                    if(bool[j] == false){
                        arr.add(j);
                        bool[j] = true;
                    }
                }
            }
        }
        return arr;
    }
}