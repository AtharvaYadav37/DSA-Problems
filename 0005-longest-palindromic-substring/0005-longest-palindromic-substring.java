class Solution {
    int start, maxLength;
    public String longestPalindrome(String s) {
        int length = s.length();
        if(length < 2)
            return s;
        
        for(int i = 0; i < length-1; i++){
            search(s, i, i);
            search(s, i, i+1);
        }
        return s.substring(start, start + maxLength);
    }

    public void search(String str, int left, int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        int length = right - left - 1;
        if(length > maxLength){
            start = left+1;
            maxLength = length;
        }
    }
}