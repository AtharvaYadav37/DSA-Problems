class Solution {
    public boolean reorderedPowerOf2(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map = getDigitCount(n);

        for(int i = 1; i <= 1000000000; i *= 2){
            if(map.equals(getDigitCount(i))){
                return true;
            }
        }
        return false;
    }

    public HashMap getDigitCount(int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n > 0){
            map.put(n % 10, map.getOrDefault(n % 10, 0) + 1);
            n /= 10;
        }
        return map;
    }
}