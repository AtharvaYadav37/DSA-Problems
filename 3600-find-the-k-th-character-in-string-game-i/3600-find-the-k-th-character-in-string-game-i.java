class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder();
        word.append('a');
        while(word.length() <= k){
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                temp.append((char)(word.charAt(i) + 1));
            }
            word.append(temp);
        }
        return word.charAt(k-1);
    }
}