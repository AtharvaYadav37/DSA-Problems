class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = piles[0];
        for(int i = 1; i < piles.length; i++)   high = Math.max(high, piles[i]);

        int low = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            int k = calculateHours(piles, mid, h);

            if(k == -1)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    static int calculateHours(int[] piles, int k, int h){
        int len = piles.length;
        int i = 0;
        int totalHours = 0;

        while(i < len){
            totalHours = totalHours + (int)(Math.ceil(piles[i] / (double)k));
            if(totalHours > h)  return 1;
            ++i;
        }

        return -1;
    }
}