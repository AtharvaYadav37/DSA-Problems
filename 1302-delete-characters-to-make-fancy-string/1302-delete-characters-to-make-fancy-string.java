class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        int c = 1;
        str.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                c++;
            }
            else{
                c = 1;
            }
            if(c <= 2){
                str.append(s.charAt(i));
            }
        }

        return str.toString();
    }
}