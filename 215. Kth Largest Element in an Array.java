// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> prq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            prq.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(prq.peek()<nums[i]){
                prq.remove();
                prq.add(nums[i]);

            }
        }

        return prq.peek();
    }
}