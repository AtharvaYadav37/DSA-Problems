class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int len = startTime.length;
        int[] freeTime = new int[len+1];
        freeTime[0] = startTime[0];

        for(int i = 1; i < len; i++){
            freeTime[i] = startTime[i] - endTime[i - 1];
        }

        freeTime[freeTime.length - 1] = eventTime - endTime[len - 1];

        int windowSize = k + 1;
        int currentSum = 0;

        for (int i = 0; i < windowSize; i++) {
            currentSum += freeTime[i];
        }

        int maxFree = currentSum;

        for (int i = windowSize; i < freeTime.length; i++) {
            currentSum = currentSum + freeTime[i] - freeTime[i - windowSize];
            maxFree = Math.max(maxFree, currentSum);
        }

        return maxFree;
    }
}