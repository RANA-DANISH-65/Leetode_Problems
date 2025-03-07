import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int expectedElem = target - nums[i];
                if (map.containsKey(expectedElem)) {
                    return (new int[]{map.get(expectedElem), i});
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        Two_Sum two = new Two_Sum();
        Two_Sum.Solution sol = two.new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(sol.twoSum(nums, 9)));

    }
}
