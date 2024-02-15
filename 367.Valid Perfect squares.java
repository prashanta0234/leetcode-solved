// https://leetcode.com/problems/valid-perfect-square/

// brute force method

class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        while(i<=num/i){
            if(i*i==num){
                return true;
            }
            i++;
        }
        return false;
    }
}