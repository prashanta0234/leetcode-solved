// https://leetcode.com/problems/min-stack/
// Brute force
class MinStack {
    Stack<Integer> stk=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(stk.isEmpty()){
            stk.push(val);
            min.push(val);
            return;
        }

        stk.push(val);
        int temp= Math.min(val,min.peek());
        min.push(temp);
        
    }
    
    public void pop() {
        stk.pop();
        min.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
        
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