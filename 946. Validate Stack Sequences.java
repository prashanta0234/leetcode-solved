// https://leetcode.com/problems/validate-stack-sequences/description/

// brute force

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk=new Stack<>();
        int n=0;

        for(int i=0;i<pushed.length;i++){
             stk.push(pushed[i]);
            while(!stk.isEmpty()&&stk.peek()==popped[n]){
                stk.pop();
                n++;    
            }
           

        }

            if(stk.isEmpty()){
                return true;
            }
            return false;
       
        
    }
}

// More optimal

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk=new Stack<>();
        int n=0;
        int m=0;

        while(n<pushed.length&&m<popped.length){
            if(stk.isEmpty()){
                stk.push(pushed[n]);
                n++;
                continue;
                
            }
            if(stk.peek()==popped[m]){
                stk.pop();
                m++;
            }else{
                stk.push(pushed[n]);
                n++;
            }
        }

        while(m<popped.length&&stk.peek()==popped[m]){
            stk.pop();
            m++;
        }

            if(stk.isEmpty()){
                return true;
            }
            return false;
       
        
    }
}