class Solution {
    public String shortestPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1)
            return s;
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        for(int i = 0; i < s.length(); i++){
            if(s.startsWith(rev.substring(i))){
                return rev.substring(0, i) + s;
            }
        }
        return rev + s;
    }
}