import java.util.*;

public class FindDisapperedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] hash = new int[nums.length + 1];
        for (int i : nums) {
            hash[i] = 1;
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == 0) {
                l.add(i);
            }
        }
        return l;

    }
}
