class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            fact *= i;
            list.add(i);
        }

        --k;
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < n; i++){
            fact = fact / (n - i);
            ret.append(list.get(k / fact));
            list.remove(k / fact);
            k = k % fact;
        }

        return ret.toString();
    }
}