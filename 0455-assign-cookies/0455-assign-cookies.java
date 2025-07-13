class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gLen = g.length;
        int sLen = s.length;
        int match  = 0;

        int gIndex = 0;
        int sIndex = 0;
        while(gIndex < gLen && sIndex< sLen){
            if(g[gIndex] <= s[sIndex]){
                match++;
                gIndex++;
                sIndex++;
            } 
            else{
                sIndex++;
            }
        }

        return match;
    }
}