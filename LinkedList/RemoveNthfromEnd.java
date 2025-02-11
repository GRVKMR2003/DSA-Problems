public class RemoveNthfromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        int l = length(head); // Get the total length of the list
        int target = l - n;   // Find the position from the start

        if (target == 0) { // If removing the first node
            return head.next;
        }

        ListNode c = head;
        for (int i = 1; i < target; i++) { // Move to the (target-1)th node
            c = c.next;
        }

        c.next = c.next.next; // Remove the nth node from end

        return head;
    }

    public int length(ListNode head) {
        int x = 0;
        ListNode c = head;
        while (c != null) {
            c = c.next;
            x++;
        }
        return x;
    }
}
