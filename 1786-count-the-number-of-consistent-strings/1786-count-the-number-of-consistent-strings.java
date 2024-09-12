class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        Set<Character> allow = new HashSet<>();
        for(int j = 0; j < allowed.length(); j++)
                allow.add(allowed.charAt(j));
        for(int i = 0; i < words.length; i++){
            boolean f = true;
            for(int j = 0; j < words[i].length(); j++)
                if(!(allow.contains(words[i].charAt(j)))){
                    f = false;
                    break;
                }
                
            if(f)
                c++;           
        }
        return c;
    }
}