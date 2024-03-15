// https://www.geeksforgeeks.org/problems/key-pair5616/1

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            if(x>=arr[i]){
                list.add(arr[i]);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            int temp=x-list.get(i);
            
            if(list.indexOf(temp)!=i&&list.contains(temp)){
                return true;
            }
        }
        
        return false;
    }
}