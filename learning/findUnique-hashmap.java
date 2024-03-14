// find the unique number from int array

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
        
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        
        return 0;
    }  
    
}
