// https://leetcode.com/problems/climbing-stairs/description/

class Solution {
    public int climbStairs(int n) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        return staires(n,arr);
    }
    public int staires(int n,int[] arr){
        if(n==1||n==2){return n;}
        if(arr[n]!=-1){
            return arr[n];
        }

        int a=staires(n-1,arr);
       int b= staires(n-2,arr);

       arr[n]=a+b;

        return a+b;
    }
}