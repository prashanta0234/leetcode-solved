// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=2;
        int high=nums.length-3;
         if(nums.length == 1){
            return nums[0];
        }

        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
         while(high>low){
            int mid=(high+low)/2;
            if(nums[mid]!=nums[mid-1] &&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid-1]==nums[mid]){
                mid--;
            }
            if(mid%2==0){
                low=mid+2;
            }else{
                high=mid-1;
            }
         }   

         return nums[low];     
    }
}