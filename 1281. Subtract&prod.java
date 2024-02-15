class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        int i=0;
        while(n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            prod*=lastDigit;
            n=n/10;
        }

        return prod-sum;
    }
}