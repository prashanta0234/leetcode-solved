// Given N 2D Points, Calculate no. of distinct points among them.
// Ex: x[5] = {2, 1, 3, 2, 2}
//     y[5] = {3, 1, 2, 3, 4}
    
// The first array represents the x co-ordinates, the second array represents the y co-ordinate. Acoording to above examples the points are 
//     (x[0],y[0])->(2,3)
//     (x[1],y[1])->(1,1)
//     (x[2],y[2])->(3,2)
//     (x[3],y[3])->(2,3)
//     (x[4],y[4])->(2,4)
    
// Total number of distinct points are 4.

public class Solution {
    
    public static void numberOfDistinctPoints(int[] arr,int[] arr1,int n){
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            int result = Integer.parseInt(String.valueOf(arr[i]) + String.valueOf(arr1[i]));
            set.add(result);
        }
        
        System.out.print(set.size());
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[] arr=new int[n];
        int[] arr1=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=scn.nextInt();
        }
        
        numberOfDistinctPoints(arr,arr1,n);
    }
}