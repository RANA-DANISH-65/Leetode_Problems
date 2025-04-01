public class FlattenList {


    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }



    public Node flatten(Node head) {
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                curr.next = flatten(curr.child);
                curr.next.prev = curr;
                curr.child = null;
                while (curr.next != null) curr = curr.next;
                if (next != null) {
                    curr.next = next;

                    next.prev = curr;
                }
            }
            curr = curr.next;
        }
        return head;
    }
}
