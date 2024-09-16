class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int maxH = Integer.parseInt(timePoints.get(timePoints.size() - 1).substring(0, 2))*60;
        int maxM = Integer.parseInt(timePoints.get(timePoints.size() - 1).substring(3, 5));
        int minH = Integer.parseInt(timePoints.get(0).substring(0, 2))*60;
        int minM = Integer.parseInt(timePoints.get(0).substring(3, 5));
        int min = (1440 + minH + minM) - (maxH + maxM);
        for(int i = 1; i < timePoints.size(); i++){
            maxH = Integer.parseInt(timePoints.get(i).substring(0, 2))*60;
            maxM = Integer.parseInt(timePoints.get(i).substring(3, 5));
            minH = Integer.parseInt(timePoints.get(i-1).substring(0, 2))*60;
            minM = Integer.parseInt(timePoints.get(i-1).substring(3, 5));
            min = Math.min(min, ((maxH + maxM) - (minH + minM)));
        }
    return min;
    }
}