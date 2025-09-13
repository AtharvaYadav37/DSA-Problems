class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowel.put(c, vowel.getOrDefault(c, 0) + 1);
            else
                consonant.put(c, consonant.getOrDefault(c, 0) + 1);
        }

        int sum = 0;
        for(int c: vowel.values()){
            sum = Math.max(sum, c);
        }

        int k = 0;
        for(int c: consonant.values()){
            k = Math.max(k, c);
        }

        return sum + k;
    }
}