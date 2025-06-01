class Solution {
    public long distributeCandies(int n, int limit) {
        return combination(n) - 3L * combination(n - (limit + 1)) + 3L * combination(n - 2 * (limit + 1)) - combination(n - 3 * (limit + 1));
    }

    public long combination(int a){
        if(a < 0)
            return 0;
        return ((long)(a + 1) * (a + 2)) / 2L;
    }
}