public class max_dif_bet_adj_el {
    public static int maxAdjacentDifference(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int diff = nums[i] - nums[i + 1];
            diff = diff < 0 ? (-1 * diff) : diff;
            max = Math.max(max, diff);

        }
        int newDiff = nums[0] - nums[nums.length - 1];
        return Math.max(max, newDiff<0?(-1*newDiff):newDiff);
    }

    public static void main(String[] args) {
        System.out.println(maxAdjacentDifference(new int[]{1,2,4}));
    }
}
