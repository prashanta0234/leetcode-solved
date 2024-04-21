// https://leetcode.com/problems/reverse-linked-list/description/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        
        ListNode prev=null;
        while(temp!=null){
           ListNode nx=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nx;
        }
        return prev;
    }
}