public class Remove_Duplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int newLength=1;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    nums[newLength]=nums[i];
                    newLength++;
                }
            }
            return newLength;
        }
    }

    public static void main(String[] args) {
        Remove_Duplicates outer=new Remove_Duplicates();
        Remove_Duplicates.Solution inner=outer.new Solution();
        System.out.println( inner.removeDuplicates(new int[]{1,1,2}));
    }
}
