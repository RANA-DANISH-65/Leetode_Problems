import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans[i] = stack.peek() - i;
            } else {
                ans[i] = 0;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        DailyTemperatures obj = new DailyTemperatures();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = obj.dailyTemperatures(temperatures);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
