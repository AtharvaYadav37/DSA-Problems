class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1 )
            return true;
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            while(i < j && !charOrDigit(s.charAt(i)))
                ++i;
            while(i < j && !charOrDigit(s.charAt(j)))
                --j;
            if(s.charAt(i) != s.charAt(j))
                return false;
            ++i;
            --j;
        }
        return true;
    }
    public boolean charOrDigit(char c){
        return (Character.isDigit(c) || Character.isLetter(c));
    }
}