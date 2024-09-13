class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        String check = "";
        for(int i = 0; i < strs[0].length(); i++){
            check = check + Character.toString(strs[0].charAt(i));
            for(int j = 0; j < strs.length; j++)
                if(i >= strs[j].length())
                    return s;
                else if(!(strs[j].substring(0,i+1).equals(check)))
                    return s;
            s = s + Character.toString(strs[0].charAt(i));
        }
        return s;
    }
}