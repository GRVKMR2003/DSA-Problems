class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null|| head.next==null)return head;

        ListNode c =head;
        ListNode n=head;

        while(n!=null && n.next!=null){
            n=n.next.next;
            c=c.next;

        }

        return c;
    }
}