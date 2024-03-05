// https://leetcode.com/problems/number-of-1-bits/description/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>>1;
        }
        return count;
    }
}