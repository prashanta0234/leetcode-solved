// In Brute force my loop will run n th time but i can optimize this code, when i find a factorial i get pair of numbers, like 1*24,2*14,4*6,3*8,24*1,12*2,6*4,8*3. My condition will pass only 8 times, if i count 2 if my condition will pass then i can get 2 numbers at a time. if i run this code 4 time(sqrt(n)=4) then i can reduce the time complexity

// Brute force method

class CountFactorial {
    public static void main(String[] args) {
    int n=24;
    int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}

// optimized method

class OptimizedCountFactorial {
    public static void main(String[] args) {
    int n=24;
    int count=0;

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count+=2;
            }
        }
        System.out.println(count);
    }
}