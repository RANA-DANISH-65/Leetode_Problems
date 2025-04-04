public class SortColors {
    //Dutch National Flag Algorithm
    public void sortColors(int[] nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low++,mid++);
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid++,high--);
            }
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
