class Solution {
    public int maxDifference(String s) {
        int[] arr =new int[26];
        
        for(int i = 0; i < s.length(); i++){
            int posToIncrement = s.charAt(i) - 'a';
            arr[posToIncrement]++;
        }

        int maxOddFreq = 1;
        int minEvenFreq = 100;      //At max we can have 100 characters in the string

        for(int i = 0; i < 26; i++){
            if(arr[i] % 2 == 1 && arr[i] > maxOddFreq){
                maxOddFreq = arr[i];
            }
            if(arr[i] != 0 && arr[i] % 2 == 0 && arr[i] < minEvenFreq){
                minEvenFreq = arr[i];
            }
        }

        return maxOddFreq - minEvenFreq;
    }
}