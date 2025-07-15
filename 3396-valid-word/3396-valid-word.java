class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }

        word = word.toLowerCase();

        boolean[] bool = new boolean[2];
        Arrays.fill(bool, false);

        for(char c : word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if(Character.isLetter(c)){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    bool[0] = true;
                }
                else{
                    bool[1] = true;
                }
            }
        }

        if(!bool[0] || !bool[1]){
            return false;
        }
        return true;
    }
}