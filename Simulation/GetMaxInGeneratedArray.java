public class GetMaxInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;
        for (int i = 1; i * 2 < n; i++) {
            arr[i * 2] = arr[i];

            if (i * 2 + 1 <= n) {
                arr[2*i + 1] = arr[i] + arr[i + 1];
                max = Math.max(max, arr[i * 2 + 1]);

            }
        }
        return max;
    }
}
