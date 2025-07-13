class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int pLen = players.length;
        int tLen = trainers.length;
        int match  = 0;

        int pIndex = 0;
        int tIndex = 0;
        while(pIndex < pLen && tIndex< tLen){
            if(players[pIndex] <= trainers[tIndex]){
                match++;
                pIndex++;
                tIndex++;
            } 
            else{
                tIndex++;
            }
        }

        return match;
    }
}