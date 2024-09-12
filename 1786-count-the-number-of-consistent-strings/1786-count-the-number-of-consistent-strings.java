class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        Set<Character> allow = new HashSet<>();
        for(int j = 0; j < allowed.length(); j++)
                allow.add(allowed.charAt(j));
        for(int i = 0; i < words.length; i++){
            Set<Character> word = new HashSet<>();
            for(int j = 0; j < words[i].length(); j++)
                word.add(words[i].charAt(j));
            if(word.size() > allowed.length())
                continue;
            boolean f = true;
            for(char w : word) 
                if(!(allow.contains(w))){
                    f = false;
                    break;
                }
            if(f)
                c++;           
        }
        return c;
    }
}