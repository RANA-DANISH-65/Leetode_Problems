public class Even_Partitions {
    public static class Solution {
        public int countPartitions(int[] nums) {
            int totalSum = 0;
            for (int num : nums) {
                totalSum += num;
            }
            int leftSum = 0;
            int partitions = 0;
            for (int num : nums) {
                leftSum += num;
                int rightSum = totalSum - leftSum;
                if (((leftSum - rightSum) % 2) == 0) {
                    partitions++;
                }
            }
            return partitions;
        }
    }
}
