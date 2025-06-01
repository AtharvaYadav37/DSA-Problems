class Solution {
    public long distributeCandies(int n, int limit) {
        //Use stars and bars method from permutation and combination


        return combination(n) - 3L * combination(n - (limit + 1)) + 3L * combination(n - 2 * (limit + 1)) - combination(n - 3 * (limit + 1));
    }

    public long combination(long a){
        if(a < 0)
            return 0;
        return ((a + 1) * (a + 2)) / 2L;
    }
}