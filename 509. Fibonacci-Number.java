// https://leetcode.com/problems/fibonacci-number/description/

// brute force method

class Solution {
    public int fib(int n) {

        int f=0;
        int l=1;
        int i=0;
        int sum=0;
        if(n<=1) return n;
        while(n-1>i){
            sum=f+l;
            f=l;
            l=sum;
            i++;
        }
        return sum;
    }
}

// recursive method

// The Rule is xn = xn−1 + xn−2

class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}