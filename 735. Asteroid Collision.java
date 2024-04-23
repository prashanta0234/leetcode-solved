// https://leetcode.com/problems/asteroid-collision/description/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
       

        int n=asteroids.length;
        int i=0;
        while(i<n){
            if(asteroids[i] < 0){
                if(st.size()==0 || st.peek()<0){
                    st.push(asteroids[i]);
                    i++;
                }
                else if(st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                    i++;
                }
                else if(st.peek()< Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(st.peek() > Math.abs(asteroids[i])){
                    i++;
                }
            }else{
                st.push(asteroids[i]);
                i++;
            }
        }
   

       
         int[] arr = new int[st.size()];
         int m=st.size()-1;
         while(!st.isEmpty()){
            arr[m]=st.pop();
            m--;
         }
        return arr;
        
    }
}