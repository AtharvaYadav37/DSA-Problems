class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] minLeft = new int[len];
        int[] maxRight = new int[len];

        minLeft[0] = prices[0];
        maxRight[len - 1] = prices[len - 1];

        for(int i = 1; i < len; i++){
            minLeft[i] = Math.min(prices[i], minLeft[i - 1]);
        }

        for(int i = len - 2; i >= 0; i--){
            maxRight[i] = Math.max(prices[i], maxRight[i + 1]);
        }

        int maxProfit = 0;
        for(int i = 0; i < len; i++){
            int temp = maxRight[i] - minLeft[i];
            maxProfit = Math.max(temp, maxProfit);
        }

        return maxProfit;
    }
}