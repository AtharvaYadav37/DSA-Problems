class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        String[] sRow = new String[numRows];
        for(int i = 0; i < numRows; i++)
            sRow[i] = "";
        int k = 0;
        int f = 1;
        int len = s.length();
        for(int i = 0; i < len; i++){
            sRow[k] = sRow[k] + Character.toString(s.charAt(i));
            if((k + f) < 0 || (k+f) > (numRows - 1))
                f *= -1;
            k += f;
        }
        String s1 = "";
        for(String a : sRow)
            s1 = s1 + a;
        return s1;
    }
}