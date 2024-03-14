// https://www.geeksforgeeks.org/problems/non-repeating-element3958/1


class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int temp=map.get(arr[i]);
                map.put(arr[i],temp+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        
        return 0;
    }  
    
}