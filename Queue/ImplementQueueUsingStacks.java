import java.util.Stack;

public class ImplementQueueUsingStacks {
    public class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public Queue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void add(Integer el) {
            if (s1.isEmpty()) {
                s1.push(el);
                return;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(el);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int pop() {
            return s1.pop();
        }

        public int peek() {
            return s1.peek();
        }

        public boolean empty() {
            return s1.isEmpty();
        }
    }
}
