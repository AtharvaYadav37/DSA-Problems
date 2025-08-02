class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int len = basket1.length;
        int globalMin = Integer.MAX_VALUE;
        long minCost = 0;
        HashMap<Integer, Integer> totalCount = new HashMap<>();

        for(int i = 0; i < len; i++){
            totalCount.put(basket1[i], totalCount.getOrDefault(basket1[i], 0) + 1);
            totalCount.put(basket2[i], totalCount.getOrDefault(basket2[i], 0) - 1);
            globalMin = Math.min(globalMin, basket1[i]);
            globalMin = Math.min(globalMin, basket2[i]);
        }
        
        ArrayList<Integer> surplus = new ArrayList<>();
        for(int val : totalCount.keySet()){
            int freq = totalCount.get(val);
            if(freq % 2 != 0){
                return -1;
            }
            for(int i = 0; i < Math.abs(freq) / 2; i++){
                surplus.add(val);
            }
        }

        Collections.sort(surplus);
        for(int i = 0; i < surplus.size() / 2; i++){
            minCost += Math.min(2*globalMin, surplus.get(i));
        }

        return minCost;
    }
}
