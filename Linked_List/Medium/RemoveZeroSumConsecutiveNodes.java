import java.util.HashMap;

public class RemoveZeroSumConsecutiveNodes {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public class Solution {
        public ListNode removeZeroSumSublists(ListNode head) {
            // Create a dummy node to simplify edge cases
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            // Use a hashmap to store the running sum and its corresponding node
            HashMap<Integer, ListNode> prefixSumMap = new HashMap<>();
            prefixSumMap.put(0, dummy);  // Initialize the map with sum 0 at the dummy node

            int runningSum = 0;
            ListNode current = head;

            // First pass: Build the prefix sum map
            while (current != null) {
                runningSum += current.val;
                prefixSumMap.put(runningSum, current);
                current = current.next;
            }

            // Second pass: Remove nodes between two same running sums
            current = dummy;
            runningSum = 0;

            while (current != null) {
                runningSum += current.val;
                // Skip the nodes between the same prefix sum
                current.next = prefixSumMap.get(runningSum).next;
                current = current.next;
            }

            return dummy.next;
        }

        // Helper method to print the linked list (for testing purposes)
        public void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }


    }

}
