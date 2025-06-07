class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int len = heights.length;

        for(int i = 0; i <= len; i++){
            int length = (i == heights.length) ? 0 : heights[i];
            
            while(!stack.isEmpty() && length < heights[stack.peek()]){
                int pop = stack.pop();
                int height = heights[pop];
                int breadth = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * breadth);
            }

            stack.push(i);
        }        

        return maxArea;
    }
}