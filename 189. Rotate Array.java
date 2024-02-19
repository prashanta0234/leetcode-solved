// https://leetcode.com/problems/rotate-array/description/

class Solution {
    public void swap(int[] nums,int p,int l){

        while(p<l){
            int temp=nums[p];
            nums[p]=nums[l];
            nums[l]=temp;
            p++;
            l--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        this.swap(nums,0,nums.length-1);
        this.swap(nums,0,k-1);
        this.swap(nums,k,nums.length-1);

    }
}