import java.util.Collections;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);
        Collections.addAll(minHeap, lists);
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }
        return dummyHead.next;
    }
}
