// https://leetcode.com/problems/find-peak-element/description/

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        

        int high=nums.length-2;
        int low=1;

        while(high>=low){
            int mid=(high+low)/2;

            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid-1]>nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}