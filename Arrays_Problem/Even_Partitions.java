public class Even_Partitions {
    public class Solution {
        public int countPartitions(int[] nums) {
            int totalSum = 0;
            for (int n : nums) {
                totalSum += n;
            }
            int leftSum = 0;
            int partitions = 0;
            for (int i = 0; i < nums.length; i++) {
                leftSum += nums[i];
                int rightSum = totalSum - leftSum;
                if (leftSum % 2 == 0 && rightSum % 2 == 0) {
                    partitions++;
                }
            }
            return partitions;
        }
    }
}
