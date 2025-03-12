public class DesignCircularQueue {
    class MyCircularQueue {
        private int[] queue;
        private int front, rear, size, capacity;

        public MyCircularQueue(int k) {
            queue = new int[k];
            capacity = k;
            size = 0;
            front = 0;
            rear = -1;
        }

        public boolean enQueue(int value) {
            if (isFull()) return false;
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) return false;
            front = (front + 1) % capacity;
            size--;
            return true;
        }

        public int Front() {
            return isEmpty() ? -1 : queue[front];
        }

        public int Rear() {
            return isEmpty() ? -1 : queue[rear];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;


        }
    }}
