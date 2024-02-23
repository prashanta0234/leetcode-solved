// Question:https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        int reverse=0;
            while(x!=0){
            int mod=x%10;
           
            reverse= reverse*10+mod;
            x=x/10;
             if(reverse%10!=mod){
                return 0;
                
            } 
                
        }
        return reverse;
    }
}


