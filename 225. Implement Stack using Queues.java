// https://leetcode.com/problems/implement-stack-using-queues/description/
class MyStack {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();


    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
        
    }
    
    public int pop() {
        if(q1.size()>0){
            while(q1.size()>1){
            q2.add(q1.remove());
        }
        int ans=q1.remove();
        while(q2.size()>0){
            q1.add(q2.remove());
        }
        return ans;
        }
        return -1;
    }
    
    public int top() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int ans=q1.peek();
         q2.add(q1.remove());
        while(q2.size()>0){
            q1.add(q2.remove());
        }
        return ans;
    }
    
    public boolean empty() {
        if(q1.size()>0){
            return false;
        }else{
            return true;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */