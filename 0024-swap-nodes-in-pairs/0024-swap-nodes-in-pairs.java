class Solution {
    public ListNode swapPairs(ListNode head) {
        // Dummy node to handle head swapping
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = temp;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swap nodes
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move current two nodes ahead
            current = first;
        }

        return temp.next;
    }
}
