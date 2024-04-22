// https://leetcode.com/problems/reorder-list/description/

class Solution {
    public void reorderList(ListNode head) {

        // find the mid
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        // split 2 parts
        ListNode restPart=slow.next;
        slow.next=null;
        // reverse rest part

        ListNode prev=null;
        ListNode restPart1=restPart;
        ListNode nxt=null;

        while(restPart1!=null){
            nxt=restPart1.next;
            restPart1.next=prev;
            prev=restPart1;
            restPart1=nxt;
        }

        // connect two list

        ListNode left=head;
        ListNode right=prev;

        while(right!=null){
            ListNode leftNext=left.next;
            ListNode rightNext=right.next;

            left.next=right;
            right.next=leftNext;
            left=leftNext;
            right= rightNext;
            
        }
        
    }
}