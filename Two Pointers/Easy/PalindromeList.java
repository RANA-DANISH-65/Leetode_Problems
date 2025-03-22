import java.util.List;

public class PalindromeList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        ListNode mid = getMid(head);
        ListNode secondHalf = reverseList(mid);
        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode mid) {
        ListNode prev = null;
        while (mid != null) {
            ListNode next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        return prev;
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
