class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> ret = new HashSet<>();
        
        for(int i = 0; i < s.length() - 10 + 1; i++){
            String a = s.substring(i, i + 10);
            if(set.contains(a)){
                ret.add(a);
            }else{
                set.add(a);
            }
        }

        return new ArrayList<String>(ret);
    }
}