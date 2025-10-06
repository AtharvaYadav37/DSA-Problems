// class Solution {
//     public int longestSubsequence(int[] nums) {
//         int len = nums.length - 1;
        
//         if(len == 0 && nums[0] == 0)
//             return 0;

//         int left = 0;
//         int pre = nums[0];
//         int right = len;
//         int post = nums[len];
//         int max = 0;


//         for(int i = 1; i <= len; i++){
//             pre = pre ^ nums[i];
//             post = post ^ nums[len - i];

//             if(pre == 0){
//                 pre = nums[i];
//                 left = i;
//             }
//             if(post == 0){
//                 post = nums[len - i];
//                 right = len - i;
//             }

//             max = Math.max(max, Math.max(i - left, right - len - i) + 1);
//         }

//         return max;
//     }
// }


class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        for (int n : nums) {
            totalXor ^= n;
        }

        // If entire XOR is non-zero → whole array works
        if (totalXor != 0) return nums.length;

        // If all elements are zero → no valid subsequence
        boolean allZero = true;
        for (int n : nums) {
            if (n != 0) {
                allZero = false;
                break;
            }
        }

        if (allZero) return 0;

        // Otherwise, we can remove one element and still get non-zero XOR
        return nums.length - 1;
    }
}
