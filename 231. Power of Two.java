// https://leetcode.com/problems/power-of-two/description/

class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean flag=false;
        for(int i=0;i<31;i++){
            if((1<<i)==n){
                flag=true;
                break;
            }
        }

        return flag;
    }
}