class Solution {
    public int minOperations(String s) {
        char lowestChar = '{';      //comes after z in ASCII
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != 'a' && c < lowestChar)
                lowestChar = c;
        }

        if(lowestChar == '{')
            return 0;
        else
            return (int)('z' - lowestChar) + 1;
    }
}