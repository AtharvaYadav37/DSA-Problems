class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-start+1);
        }
        return maxLength;
    }
}