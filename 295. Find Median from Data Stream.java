// https://leetcode.com/problems/find-median-from-data-stream/description/
class MedianFinder {
    PriorityQueue<Integer> right = new PriorityQueue<>();
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(right.size()== left.size()){
            right.add(num);
            left.add(right.remove());
        }else{
            left.add(num);
            right.add(left.remove());  
        }
    }
    
    public double findMedian() {
        if(right.size()== left.size()){
            double ans= (left.peek() + right.peek()) /2.0;
            return ans;
        }else{
            return left.peek()*1.0;
        }
    }
}