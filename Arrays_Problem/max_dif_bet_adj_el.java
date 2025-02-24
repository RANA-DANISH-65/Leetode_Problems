public class max_dif_bet_adj_el {
    public int maxAdjacentDistance(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - nums[i + 1];
            diff = diff < 0 ? (diff * -1) : diff;
            max = max > diff ? max : diff;
        }
        return max;
    }
}
