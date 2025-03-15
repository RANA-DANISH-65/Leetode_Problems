public class SortList {
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Get the middle and split the list
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;  // Disconnect left half from right half

        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Merge sorted halves
        return merge(left, right);
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;  // `prev` is the actual mid before disconnection
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;

        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        temp.next = (left != null) ? left : right;
        return dummyHead.next;
    }
}

