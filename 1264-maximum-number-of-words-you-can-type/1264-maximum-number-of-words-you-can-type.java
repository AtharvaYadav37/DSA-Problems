class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < brokenLetters.length(); i++)
            set.add(brokenLetters.charAt(i));

        int count = 0;
        text = text + " ";

        for(int i = 0; i < text.length(); i++){
            boolean flag = true;
            while(text.charAt(i) != ' '){
                char c = text.charAt(i++);
                if(set.contains(c))
                    flag = false;
            }
            if(flag)    count++;
        }

        return count;
    }
}