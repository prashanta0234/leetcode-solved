// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode next=null;

        if(head==null){
            return null;
        }

        while(temp.next!=null){
           if(temp.val==temp.next.val){

            next=temp.next.next;

            temp.next=next;
           }else{
            temp=temp.next;
           }
           
        }
        return head;
        
    }
}