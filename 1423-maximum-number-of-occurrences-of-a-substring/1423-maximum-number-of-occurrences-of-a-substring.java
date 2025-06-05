class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> set = new HashMap<>();
        HashSet<Character> letter = new HashSet<>();
        int max = 0;

        int i = 0;
        for(i = 0; i < s.length() - minSize + 1; i++){
            String a = s.substring(i, i + minSize);
            for(char c : a.toCharArray())
                letter.add(c);
            if(letter.size() <= maxLetters)
                set.put(a, set.getOrDefault(a, 0) + 1);
            letter.clear();
        }

        for(int val : set.values()){
            if(val > max)
                max = val;
        }
        return max;
    }
}