class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        int k = 1;

        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            str = new String(chars);
            

            if(map.containsKey(str)){
                int key = map.get(str);
                list.get(key - 1).add(strs[i]);
            }
            else{
                map.put(str, k++);
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                list.add(l);
            }

        }
        return list;
    }
}