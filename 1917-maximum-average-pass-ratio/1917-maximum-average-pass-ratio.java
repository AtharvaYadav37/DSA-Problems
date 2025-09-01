class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((p1, p2) -> {
            double pass1 = (p1[0]+1.0)/(p1[1]+1) - (double)p1[0]/p1[1];
            double pass2 = (p2[0]+1.0)/(p2[1]+1) - (double)p2[0]/p2[1];
            if(pass1 > pass2)
                return -1;
            else if(pass1 == pass2 && p1[1] < p2[1])
                return -1;
            return 1;
        });

        for(int i = 0; i < classes.length; i++){
            minHeap.add(classes[i]);
        }

        while(extraStudents-- > 0){
            int[] temp = minHeap.poll();
            ++temp[0];
            ++temp[1];
            minHeap.add(temp);
        }

        double ret = 0;
        for(int i = 0; i < classes.length; i++){
            int[] temp = minHeap.poll();
            ret = ret + (double)temp[0] / temp[1];
        }

        return ret/classes.length;
    }
}