class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[arr.length];
        int[] queryReturn = new int[queries.length];
        xor[0] = arr[0];

        for(int i = 1; i < arr.length; i++)
            xor[i] = arr[i] ^ xor[i-1];

        for(int i = 0; i < queries.length; i++)
            if(queries[i][0] == 0)
                queryReturn[i] = xor[queries[i][1]];
            else
                queryReturn[i] = xor[queries[i][1]] ^ xor[queries[i][0]-1];

        return queryReturn;
    }
}