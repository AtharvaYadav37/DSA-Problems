class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] maxRight = new int[len];

        maxRight[len - 1] = prices[len - 1];

        for(int i = len - 2; i >= 0; i--){
            maxRight[i] = Math.max(prices[i], maxRight[i + 1]);
        }

        int maxProfit = 0;
        for(int i = 0; i < len; i++){
            int temp = maxRight[i] - prices[i];
            maxProfit = Math.max(temp, maxProfit);
        }

        return maxProfit;
    }
}