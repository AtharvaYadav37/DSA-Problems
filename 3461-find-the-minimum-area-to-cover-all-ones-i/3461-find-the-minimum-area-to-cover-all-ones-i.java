class Solution {
    public int minimumArea(int[][] grid) {
        int ub = Integer.MAX_VALUE;
        int lb = Integer.MIN_VALUE;
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    ub = Math.min(ub, i);
                    lb = Math.max(lb, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }

        return (lb - ub + 1) * (right - left + 1);
    }
}