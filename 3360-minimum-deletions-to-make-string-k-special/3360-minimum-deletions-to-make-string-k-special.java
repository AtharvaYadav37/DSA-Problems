class Solution {
    public int minimumDeletions(String word, int k) {
        int[] letter = new int[26];

        for(int i = 0; i < word.length(); i++){
            letter[word.charAt(i) - 'a']++;
        }
        Arrays.sort(letter);

        int flag = 0;                          //to check the when we need to start counting as 0 values indicate that the letter is not in word
        for(int i = 0; i < 26; i++){
            if(letter[i] != 0){
                flag = i;
                break;
            }
        }

        int minChanges = Integer.MAX_VALUE;
        for (int i = flag; i < 26; i++) {
            int currentFreqDiff = 0;
            for (int j = flag; j < 26; j++) {
                if (letter[j] < letter[i]) {
                    currentFreqDiff += letter[j];                       // delete all characters of this letter
                } else if (letter[j] > letter[i] + k) {
                    currentFreqDiff += letter[j] - (letter[i] + k);      // delete extras to reduce to baseFreq + k
                }
            }

            minChanges = Math.min(currentFreqDiff, minChanges);
        }

        return minChanges;
    }
}