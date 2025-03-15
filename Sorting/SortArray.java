import java.util.Arrays;

public class SortArray {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;
        int mid = nums.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }
    private int[] merge(int[] left, int[] right) {
        int[] sortedArray = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                sortedArray[k++] = left[i++];
            } else {
                sortedArray[k++] = right[j++];
            }
        }
        while (i < left.length) {
            sortedArray[k++] = left[i++];
        }
        while (j < right.length) {
            sortedArray[k++] = right[j++];
        }
        return sortedArray;
    }
}
