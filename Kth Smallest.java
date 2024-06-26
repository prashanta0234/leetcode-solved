// https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> prq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            prq.add(arr[i]);
        }
        
        for(int i=k;i<arr.length;i++){
            if(prq.peek()>arr[i]){
                prq.remove();
                prq.add(arr[i]);
            }
        }
        
        return prq.peek();

    } 
}