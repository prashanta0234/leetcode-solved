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