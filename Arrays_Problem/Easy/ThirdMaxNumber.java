public class ThirdMaxNumber {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long sLargest = Long.MIN_VALUE;
        long tLargest = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                tLargest = sLargest;
                sLargest = largest;
                largest = num;
            } else if (num > sLargest && num < largest) {
                tLargest = sLargest;
                sLargest = num;
            } else if (num > tLargest && num < sLargest) {
                tLargest = num;
            }
        }

        return tLargest == Long.MIN_VALUE ? (int) largest : (int) tLargest;
    }
}
