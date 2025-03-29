public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode leftSide = new ListNode(0);
        ListNode left = leftSide;
        ListNode rightSide = new ListNode(0);
        ListNode right = rightSide;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                left.next = curr;
                left = left.next;
            } else {
                right.next = curr;
                right = right.next;
            }
            curr = curr.next;
        }
        head = leftSide.next;
        left.next = rightSide.next;
        right.next = null;
        return head;
    }
}
