public class MaximumProductThreeNumbers {
    public int maximumProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        int tLargest = Integer.MIN_VALUE;

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

//        The reason for taking two minimum variables (minA and minB) is to handle cases.
//        where multiplying two negative numbers gives a larger positive product than
//        the product of three largest positive numbers.


        for (int num : nums) {
            if (num > largest) {
                tLargest = sLargest;
                sLargest = largest;
                largest = num;
            } else if (num > sLargest) {
                tLargest = sLargest;
                sLargest = num;
            } else if (num > tLargest) {
                tLargest = num;
            }

            if (num < minA) {
                minB = minA;
                minA = num;
            } else if (num < minB) {
                minB = num;
            }
        }

        return Math.max(largest * sLargest * tLargest, minA * minB * largest);
    }
}
