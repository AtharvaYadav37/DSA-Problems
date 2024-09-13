class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] queryReturn = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++)
                queryReturn[i] = queryReturn[i] ^ arr[j];
        }
        return queryReturn;
    }
}