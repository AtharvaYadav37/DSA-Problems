class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] arr = new int[length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1; i < length; i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                arr[st.peek()] = i - st.peek();
                int k = st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            arr[st.peek()] = 0;
            int k = st.pop();
        }
        return arr;
    }
}