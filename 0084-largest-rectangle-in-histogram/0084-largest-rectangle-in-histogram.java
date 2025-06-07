class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int len = heights.length;

        for(int i = 0; i <= len; i++){
            int length = (i == heights.length) ? 0 : heights[i];        //on reaching end of array see all possible combinations
            
            while(!stack.isEmpty() && length < heights[stack.peek()]){
                int pop = stack.pop();                                  //the last smallest value's index
                int height = heights[pop];                              //height of that value
                int breadth = stack.isEmpty() ? i : i - stack.peek() - 1;       //if empty then move all back to 0 index
                maxArea = Math.max(maxArea, height * breadth);
            }

            stack.push(i);                                              //push the current index
        }        

        return maxArea;
    }
}