class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int len = garbage.length;
        int gCount = 0;
        int mCount = 0;
        int pCount = 0;
        int gIndex = -1;
        int mIndex = -1;
        int pIndex = -1;
        
        for(int i = 1; i < travel.length; i++){
            travel[i] += travel[i-1];
        }

        for(int i = 0; i < garbage.length; i++){
            int[] arr = countOccur(garbage[i]);
            if(arr[0] != 0){
                gCount += arr[0];
                gIndex = i;
            }
            if(arr[1] != 0){
                mCount += arr[1];
                mIndex = i;
            }
            if(arr[2] != 0){
                pCount += arr[2];
                pIndex = i;
            }
        }

        int total = gCount + mCount + pCount;
        if(gIndex > 0)
            total += travel[gIndex - 1];
        if(mIndex > 0)
            total += travel[mIndex - 1];
        if(pIndex > 0)
            total += travel[pIndex - 1];

        return total;
    }

    int[] countOccur(String s){
        int[] arr = new int[3];
        for(char c : s.toCharArray()){
            switch(c){
                case 'G' : arr[0]++;
                break;
                case 'M' : arr[1]++;
                break;
                case 'P' : arr[2]++;
            }
        }
        return arr;
    }
}