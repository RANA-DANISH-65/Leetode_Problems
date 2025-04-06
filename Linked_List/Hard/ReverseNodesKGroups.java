public class ReverseNodesKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        int count = 0;
        ListNode temp = head;
        while (temp != null && count < k) {
            count++;
            temp = temp.next;
        }
        if (count == k) {
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = null;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head.next = reverseKGroup(curr, k);
            return prev;
        }
        return head;

    }
}
