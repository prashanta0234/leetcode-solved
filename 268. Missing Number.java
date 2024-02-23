// https://leetcode.com/problems/missing-number/description/
class Solution {
    public int missingNumber(int[] nums) {
       int total=0;
       for(int i=0;i<nums.length;i++){
           total+=nums[i];
       }

       int seriesRes=nums.length*(nums.length+1)/2;
       return seriesRes-total;
    }
}