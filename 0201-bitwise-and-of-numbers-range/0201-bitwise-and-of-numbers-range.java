class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int n = right;
        int m = left;
        while(n > m)
           n = n & n-1;
        return m&n;
    }
}
