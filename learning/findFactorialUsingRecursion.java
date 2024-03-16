// Find factorial using recursion

public class Solution {
    
    public static int fact(int n){
        if(n==1) return n;
        int temp=fact(n-1);
        return temp*n;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int ans=fact(n);
        System.out.print(ans);
    }
}