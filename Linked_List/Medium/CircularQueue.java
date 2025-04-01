public class CircularQueue {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head, tail;
    int size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;

        this.head = null;
        this.tail = null;
    }

    public boolean enQueue(int val) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (size == 1) {
            head = null;
            tail = null;
            return true;
        }
        head = head.next;
        tail.next = head;
        return true;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int Front() {
        return isEmpty() ? -1 : head.data;
    }

    public int Rear() {
        return isEmpty() ? -1 : tail.data;
    }
}
