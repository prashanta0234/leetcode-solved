// https://leetcode.com/problems/unique-number-of-occurrences/description/

// brute force
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> firstMap=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> secMap=new HashMap<Integer,Integer>();

        boolean flag=true;

        for(int val:arr){
            if(firstMap.containsKey(val)){
                int temp=firstMap.get(val);
                firstMap.put(val,temp+1);
            }
            else{
                firstMap.put(val,1);
            }
        } 

        for(int key:firstMap.keySet()){
            int temp=firstMap.get(key);

            if(secMap.containsKey(temp)==true){
                flag=false;
                break;
            }else{
                
                secMap.put(temp,1);
            }
        }

        return flag;
        
    }
}