class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len < 3)
            return false;

        int i = 1;
        for(i = 1; i < len; i++){
            if(arr[i] <= arr[i - 1]){
                break;
            }
        }
        if(i == len || i == 1)
            return false;

        for(; i < len; i++){
            if(arr[i] >= arr[i - 1]){
                break;
            }
        }
        if(i == len){
            return true;
        }
        return false;
    }
}