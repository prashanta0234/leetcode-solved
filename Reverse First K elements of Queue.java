// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> stk1=new Stack<>();
        Queue<Integer> temp=q;
        
        for(int i=0;i<k;i++){
            int temp1=temp.remove();
            stk1.add(temp1);
        }
        
        while(!stk1.isEmpty()){
            temp.add(stk1.pop());
        }
        
        int len=q.size()-k;
        for(int i=0;i<len;i++){
            int temp2=temp.remove();
             temp.add(temp2);
        }

        
        return temp;
    }
}