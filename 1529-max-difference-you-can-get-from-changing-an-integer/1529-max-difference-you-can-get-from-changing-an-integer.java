class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        int len = s.length();


        //maximize the number
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

        //minimize the number
        char digitToMinimize = ' ';
        char replaceWith = ' ';

        if (s.charAt(0) != '1') {
            digitToMinimize = s.charAt(0);
            replaceWith = '1';
        } else {
            for (int i = 1; i < len; i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                    digitToMinimize = s.charAt(i);
                    replaceWith = '0';
                    break;
                }
            }
        }

        StringBuilder minNum = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == digitToMinimize)
                minNum.append(replaceWith);
            else
                minNum.append(c);
        }

        return Integer.parseInt(maxNum.toString()) - Integer.parseInt(minNum.toString());
    }
}
