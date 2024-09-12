class MinStack {
    int top = -1;
    int[] stack;
    int[] min;

    public MinStack() {
        top = -1;
        stack = new int[30000];
        min = new int[30000];    
    }
    
    public void push(int val) { 
        if(val > Integer.MAX_VALUE)
            val = Integer.MAX_VALUE;
        else if(val < Integer.MIN_VALUE)
            val = Integer.MIN_VALUE;
        stack[++top] = val;
        if(top == 0)
            min[0] = val;  
        else{   
            if(min[top-1] >= stack[top])
                min[top] = stack[top];
            else
                min[top] = min[top - 1];
        }
    }
    
    public void pop() {
        --top;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return min[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
