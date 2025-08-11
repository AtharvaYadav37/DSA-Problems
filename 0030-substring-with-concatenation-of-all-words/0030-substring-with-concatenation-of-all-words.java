class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ret = new ArrayList<>();
        int wordSize = words[0].length();
        int len = words.length;
        int totalLen = len * wordSize;

        HashMap<String, Integer> map = new HashMap<>();
        for(int k = 0; k < len; k++){
            map.put(words[k], map.getOrDefault(words[k], 0) + 1);
        }
        
        for(int i = 0; i < wordSize; i++){
            int left = i;
            HashMap<String, Integer> currMap = new HashMap<>();

            for(int j = wordSize + left; j <= s.length(); j += wordSize){
                String s1 = s.substring(j - wordSize, j);
                currMap.put(s1, currMap.getOrDefault(s1, 0) + 1);

                if((j - left) > totalLen){
                    String remove = s.substring(left, left + wordSize);
                    currMap.put(remove, currMap.get(remove) - 1);
                    if(currMap.get(remove) == 0){
                        currMap.remove(remove);
                    }
                    left += wordSize;
                }

                if(currMap.equals(map)){
                    ret.add(left);
                }
            }
        }

        return ret;
    }
}