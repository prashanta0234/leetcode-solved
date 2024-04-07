// https://leetcode.com/problems/powx-n/description/
public class Solution {
    public double myPow(double x, int n) {
        if (n == 1) 
            return x;
        if (n == -1)
            return 1 / x;
        if(n==0){
            return 1;
        }
        double temp =myPow(x, n /2);

        if(n%2==0){
            return temp*temp;
        }
        else{
            return temp*temp*(n>0?x:1/x);
        }
    }
}
