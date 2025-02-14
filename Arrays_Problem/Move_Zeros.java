public class Move_Zeros {
    class Solution {
        public void moveZeroes(int[] nums) {
             int i=0,j=0;
             while(j<nums.length){
                 while(nums[i]!=0)i++;
                 while(nums[j]==0)j++;
                 int temp=i;
                 i=j;
                 j=temp;

             }
    }

    public static void main(String[] args) {
        Move_Zeros inner=new Move_Zeros();
        Move_Zeros.Solution in=inner.new Solution();
      in.moveZeroes(new int[]{0,1,0,3,12});
    }
}}
