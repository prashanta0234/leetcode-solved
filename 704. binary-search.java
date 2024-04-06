// https://leetcode.com/problems/binary-search/description/

class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        if(nums[0]==target){
                return 0;
            }

        while(high>=low){
            int mid=(low+high)/2;

            if(nums[mid]>target){
                high=mid-1;
            }
           else if(nums[mid]<target){
                low=mid+1;
            }
           else if(nums[mid]==target){
                return mid;
            }
        
            
        }
        return -1;

    }
}