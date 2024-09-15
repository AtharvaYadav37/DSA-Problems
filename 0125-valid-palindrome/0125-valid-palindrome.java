class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s1 = "";
        for(int i = 0; i < s.length(); i++)
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                s1 = s1 + Character.toString(s.charAt(i));

        int i = 0;
        int j = s1.length() - 1;
        if(s1.length() == 0)
            return true;
        while(i <= s1.length() / 2){
            if(s1.charAt(i) != s1.charAt(j))
                return false;
            ++i;
            --j;
        }
        return true;
    }
}