class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;

        boolean f = false;
        int i = 0;
        if(t.length() != 0){
            for(int j = 0; j < t.length(); j++){
                if(i == s.length())
                    break;
                if(t.charAt(j) == s.charAt(i)){
                    f = true;
                    ++i;
                }
                else
                    f = false;            
            }
        }
        if(i >= s.length())
            return f;
        else
            return false;
    }
}