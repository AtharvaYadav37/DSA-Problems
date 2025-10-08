class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        for(int i = 0; i < spells.length; i++){
            int spell = spells[i];
            int low = 0;
            int high = potions.length - 1;
            while(low <= high){
                int mid = (low + high) / 2;
                if((long)spell * potions[mid] >= success)
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            spells[i] = potions.length - low;
        }

        return spells;
    }
}