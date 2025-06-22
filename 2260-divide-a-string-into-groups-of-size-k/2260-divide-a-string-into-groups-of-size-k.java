class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        String[] ret = new String[(len + k - 1) / k];
        int index = 0;

        for(int i = 0; i < len; ){
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < k && i < len; j++){
                temp.append(s.charAt(i++));
            }
            ret[index++] = temp.toString();
        }

        String letterNeeded = "";
        int remainder = len % k;
        if (remainder != 0) {
        for(int i = 0; i < k - remainder; i++){
            letterNeeded = letterNeeded + fill;
        }
        ret[--index] = ret[index] + letterNeeded;
        }

        return ret;
    }
}