class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            int temp = a[0] - b[0];
            if((temp == 0 && a[1] > b[1]) || temp < 0)
                return -1;
            return 1;
        });

        int count = 0;
        for(int i = 0; i < points.length - 1; i++){
            int maxY = Integer.MIN_VALUE;
            int y1 = points[i][1];
            for (int j = i + 1; j < points.length; j++) {
                int y2 = points[j][1];
                
                if (y2 <= y1 && y2 > maxY) {
                    count++;
                    maxY = y2; 
                }
            }
        }

        return count;
    }
}