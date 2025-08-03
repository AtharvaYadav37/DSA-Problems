class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int len = 0;
        for(int i = 0; i < fruits.length; i++){
            len = Math.max(len, fruits[i][0]);
        }
        len = Math.max(len, startPos + k) + 1;

        //Creating array to hold number of fruits at each position
        int[] line = new int[len];
        for(int i = 0; i < fruits.length; i++){
            line[fruits[i][0]] = fruits[i][1];
        }

        //prefix sum
        for(int i = 1; i < len; i++){
            line[i] += line[i - 1];
        }

        int maxHarvest = 0;

        //left then right movement
        for(int leftPtr = 0; leftPtr <= k; leftPtr++){
            int left = startPos - leftPtr;
            if (left < 0){
                continue;
            }

            int rightPtr = k - 2 * leftPtr;
            int right = Math.min(len - 1, startPos + rightPtr);
            if (left < 0 || right >= len){
                continue;
            }

            int total = line[right] - (left > 0 ? line[left - 1] : 0);
            maxHarvest = Math.max(maxHarvest, total);
        }

        //right then left movement
        for (int rightPtr = 0; rightPtr <= k; rightPtr++) {
            int right = startPos + rightPtr;
            if (right > len - 1){
                continue;
            }

            int leftPtr = k - 2 * rightPtr;
            int left = Math.max(0, startPos - leftPtr);
            if (left < 0 || right >= len){
                continue;
            }

            int total = line[right] - (left > 0 ? line[left - 1] : 0);
            maxHarvest = Math.max(maxHarvest, total);
        }

        return maxHarvest;
    }
}