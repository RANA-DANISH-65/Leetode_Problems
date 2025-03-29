import java.util.HashMap;

public class CopyListWithRandomPointer {
    public ListNode copyRandomList(ListNode head) {
        if (head == null) return head;
        HashMap<ListNode, ListNode> map = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            map.put(temp, new ListNode(temp.val));
            temp = temp.next;
        }
        temp = head;

        while (temp != null) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
