public class Get_Max {
    public static class Solution {
        public int getMaximumGenerated(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            int max = 0;
            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 0; i * 2 < arr.length; i++) {
                arr[2 * i] = arr[i];
                if (i * 2 + 1 <= n) {
                    arr[2 * i + 1] = arr[i] + arr[i + 1];
                    max = Math.max(max, arr[i * 2 + 1]);

                }
            }
            return max;
        }
    }
}
