class Solution {
    public int findTheLongestSubstring(String s) {
        int res = 0;
        int mask = 0;
        int n = s.length();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);

            switch(c){
                case 'a' : mask ^= 1 << 0;
                break;
                case 'e' : mask ^= 1 << 1;
                break;
                case 'i' : mask ^= 1 << 2;
                break;
                case 'o' : mask ^= 1 << 3;
                break;
                case 'u' : mask ^= 1 << 4;
            }

            if(map.containsKey(mask))
                res = Math.max(res, i - map.get(mask));
            else
                map.put(mask, i);
        }
        return res;
    }
}