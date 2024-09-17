import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");
        
        Map<String, Integer> c1 = new HashMap<>();
        Map<String, Integer> c2 = new HashMap<>();
        
        for (String w : w1) {
            c1.put(w, c1.getOrDefault(w, 0) + 1);
        }
        
        for (String w : w2) {
            c2.put(w, c2.getOrDefault(w, 0) + 1);
        }
        
        ArrayList<String> u = new ArrayList<>();
        
        for (String w : c1.keySet()) {
            if (c1.get(w) == 1 && !c2.containsKey(w)) {
                u.add(w);
            }
        }
        
        for (String w : c2.keySet()) {
            if (c2.get(w) == 1 && !c1.containsKey(w)) {
                u.add(w);
            }
        }
        
        return u.toArray(new String[0]);
    }
}
