class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;

        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();

        // Build frequency map for p
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {
            // Add current char to the window map
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);

            // Remove char that’s sliding out of window
            if (i >= windowSize) {
                char toRemove = s.charAt(i - windowSize);
                if (sMap.get(toRemove) == 1) {
                    sMap.remove(toRemove);
                } else {
                    sMap.put(toRemove, sMap.get(toRemove) - 1);
                }
            }

            // Compare maps when window is full
            if (i >= windowSize - 1 && sMap.equals(pMap)) {
                res.add(i - windowSize + 1);
            }
        }

        return res;
    }
}
