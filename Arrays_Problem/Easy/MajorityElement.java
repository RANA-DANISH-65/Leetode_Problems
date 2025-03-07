public class MajorityElement {
    public int majorityElement(int[] nums) {
        int frequency = 0;
        int ans = -1;
        for (int num : nums) {
            if (frequency == 0) {
                ans = num;
            }
            if (ans == num) {
                frequency++;
            } else {
                frequency--;
            }
        }
        return ans;
    }
}
