class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < brokenLetters.length(); i++)
            set.add(brokenLetters.charAt(i));

        int count = 0;
        text = text + " ";

        for(int i = 0; i < text.length(); i++){
            boolean flag = true;
            char c = ' ';
            while(text.charAt(i) != ' '){
                if(flag)    c = text.charAt(i);
                if(set.contains(c))
                    flag = false;
                ++i;
            }
            if(flag)    count++;
        }

        return count;
    }
}