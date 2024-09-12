class Solution {
    public int myAtoi(String s) {
        if(s.length() > 0){
            int c = 1;
            long num = 0;
            int i = 0;
            while(true){
                if(i >= s.length() || (Character.toLowerCase(s.charAt(i)) >= 'a' && Character.toLowerCase(s.charAt(i)) <= 'z') || s.charAt(i) == '.')
                    return 0;
                if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                    if(s.charAt(i) == '-')
                        c = -1;
                    ++i;
                    break;
                }
                if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9)
                    break;
                ++i;
            }
            while(true){
                if(i >= s.length())
                    break;
                if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9)
                    num = num * 10 + (s.charAt(i) - '0');
                else
                    break;
                if(c == 1 && (num > Integer.MAX_VALUE))
                    return Integer.MAX_VALUE;
                if(c == -1 && ((-1) * num < Integer.MIN_VALUE))
                    return Integer.MIN_VALUE;
                ++i;
            }
            return (int)(num*c);
        }
        return 0;
    }
}