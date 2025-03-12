import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCallsCounter {
    class RecentCounter {
        private Deque<Integer> queue;

        public RecentCounter() {
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.addLast(t);
            while (queue.getFirst() < t - 3000) { 
                queue.removeFirst();
            }
            return queue.size();
        }
    }

}
