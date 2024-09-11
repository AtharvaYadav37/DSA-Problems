class Solution {
    public int minBitFlips(int start, int goal) {
        int c = 0;
        int x = start ^ goal;
        while(x > 0){
            c += x & 1;
            x = x >> 1;
        }
        return c;
    }
}