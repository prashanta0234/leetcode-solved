// https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode l=head;
        while(l!=null && l.next!=null){
            f=f.next;
            l=l.next.next;

        }
        return f;
    }
}