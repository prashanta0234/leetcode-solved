// https://leetcode.com/problems/sqrtx/description/

class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<end){
            long mid= (start+end)/2;
            if(mid*mid==x){
                return (int) mid;
            }
            if(mid*mid>x){
                end=(int) mid;
            }else{
                start=(int)mid+1;
            }
        }
        if(end*end==x) return end;
        return start-1;
    }
}