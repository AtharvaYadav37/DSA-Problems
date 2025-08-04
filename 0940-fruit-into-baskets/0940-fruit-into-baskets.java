class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        
        for(int i = 0; i < fruits.length; i++){
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            if(map.size() > 2){
                int k = fruits[left];
                
               while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }
            }
            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }
}