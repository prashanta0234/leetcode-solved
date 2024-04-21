// https://leetcode.com/problems/linked-list-cycle-ii/description/



public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;



         while(fast!=null&&fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if (slow == fast) break;

         }

          if( fast==null||fast.next ==null){
                return null;
        }
         
      
         fast=head;
         while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
         }

         return fast;
        
    }
}