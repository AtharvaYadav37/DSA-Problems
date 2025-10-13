class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)(m) * k > bloomDay.length) return - 1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i : bloomDay){
            low = Math.min(low, i);
            high = Math.max(high, i);
        }

        while(low <= high){
            int mid = (low + high) / 2;
            if(possibleDays(bloomDay, mid, m, k))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    boolean possibleDays(int[] arr, int a, int m, int k){
        int count = 0;
        int noOfBoq = 0;
        for(int i : arr){
            if(i <= a)  count++;
            else{
                noOfBoq += count / k;
                count = 0;
            }
        }
        noOfBoq += count / k;

        return noOfBoq >= m;
    }
}