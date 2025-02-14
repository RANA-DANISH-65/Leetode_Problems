public class Get_Max {
    public class Solution {
        public int getMaximumGenerated(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;

            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            int max = 1;
            for (int i = 1; 2 * i < n; i++) {
                arr[2 * i] = arr[i];
                if (2 * i + 1 <= n) {
                    arr[2 * i + 1] = arr[i + 1] + arr[i];
                    max = Math.max(max, arr[2 * i + 1]);
                }
            }
            return max;
        }
    }
}
