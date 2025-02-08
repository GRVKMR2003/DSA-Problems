
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)return  head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
        ListNode n = curr.next;
         curr.next = prev;
         prev =curr;
         curr =n;

        }

        return prev;
    }
}