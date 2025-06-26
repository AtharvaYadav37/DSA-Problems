class Solution {
    public int longestSubsequence(String s, int k) {
        int len = s.length();
        int pow2 = 1;
        int val = 0;
        int lenOfSubsequence = 0;

        for(int i = len - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '0'){
                lenOfSubsequence++;
            }
            else{
                if(val + pow2 <= k){
                    val += pow2;
                    lenOfSubsequence++;
                }
            }
            if(pow2 <= k){
                pow2 *= 2;
            }
        }

        return lenOfSubsequence;
    }
}