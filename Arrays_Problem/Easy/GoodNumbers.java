public class GoodNumbers {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isGood = true;
            if (i + k >= n && i - k < 0) {
                isGood = false;
            } else if (i - k < 0) {
                if (nums[i] > nums[i + k]) isGood = true;
            } else if (i + k >= n) {
                if (nums[i] > nums[i - k]) isGood = true;
            } else {
                if (nums[i] > nums[i - k] && nums[i] > nums[i + k]) isGood = true;
            }
            if (isGood) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
