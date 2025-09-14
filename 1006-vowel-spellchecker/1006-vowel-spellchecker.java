class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> availableWords = new HashSet<>();
        HashMap<String, String> lowerCaseWords = new HashMap<>();
        HashMap<String, String> devowelWords = new HashMap<>();

        HashSet<Character> vowels = new HashSet<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');

        for(String s: wordlist){
            availableWords.add(s);

            String temp = s.toLowerCase();

            if(!lowerCaseWords.containsKey(temp))
                lowerCaseWords.put(temp, s);
            
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                char c = temp.charAt(i);
                if(vowels.contains(c))
                    str.append('#');
                else
                    str.append(c);
            }

            if(!devowelWords.containsKey(str.toString()))
                devowelWords.put(str.toString(), s);
        }

        String[] ret = new String[queries.length];
        int i = 0;
        for(String s : queries){
            String temp = s.toLowerCase();

            if(availableWords.contains(s)){
                ret[i] = s;
            }

            else if(lowerCaseWords.containsKey(temp)){
                ret[i] = lowerCaseWords.get(temp);
            }

            else{
                StringBuilder str = new StringBuilder();
                for(int k = 0; k < s.length(); k++){
                    char c = temp.charAt(k);
                    if(vowels.contains(c))
                        str.append('#');
                    else
                        str.append(c);
                }
                
                ret[i] = devowelWords.getOrDefault(str.toString(), "");
            }

            ++i;
        }

        return ret;
    }
}