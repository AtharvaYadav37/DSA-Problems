//In this porblem we can only move to the element directly below or on the right side of the current element. We can use the element on the left.

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int i = triangle.size() - 2;  //for row
        int j = 0;  //for column

        for(; i >= 0; i--){
            for(j = 0; j <= i; j++){
                int currVal = triangle.get(i).get(j);   
                int min = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));   
                triangle.get(i).set(j, (currVal + min));
            }
        }
        return triangle.get(0).get(0);
    }
}