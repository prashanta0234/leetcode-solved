// given a number of array where every number has its twice except one number, now you have to find the unique number from the array using bitwise operation. Arithmetic operations not allowed.

// [4,7,8,4,8,7,9] unique one is 9
// apply xor operation on all elements

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^arr[i];
        }
        
        System.out.print(ans);
    }
}