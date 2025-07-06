class Solution {
    public int possibleStringCount(String word) {
        int combinations = 1;
        int k = 0;

        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i - 1)){
                k++;
            }
            else{
                combinations += k;
                k = 0;
            }
        }

        return combinations + k;
    }
}