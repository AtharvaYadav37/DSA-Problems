class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        int len = s.length();

        char digitToMaximize = '0';

        for(int i = 0; i < len; i++){
            if(s.charAt(i) != '9'){
                digitToMaximize = s.charAt(i);
                break;
            }
        }

        StringBuilder maxNum = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == digitToMaximize)
                maxNum.append('9');
            else
                maxNum.append(c);
        }

        char digitToMinimize = '9';

        for(int i = 0; i < len; i++){
            if(s.charAt(i) != '0'){
                digitToMinimize = s.charAt(i);
                break;
            }
        }

        StringBuilder minNum = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == digitToMinimize)
                minNum.append('0');
            else
                minNum.append(c);
        }

        return Integer.parseInt(maxNum.toString()) - Integer.parseInt(minNum.toString());
    }
}