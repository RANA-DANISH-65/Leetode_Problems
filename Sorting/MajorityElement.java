public class MajorityElement {
    // Boyer-Moore Voting Algorithm
    //Agar koi number > n/2 baar repeat ho raha hai,
    // toh opposition wale numbers kabhi usko completely eliminate nahi kar sakte.
    public int majorityElement(int[] nums) {
        int frequency = 0;
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (frequency == 0) {
                answer = nums[i];
            }
            if (answer == nums[i]) {
                frequency++;
            } else {
                frequency--;
            }

        }
        return answer;
    }
}
