public class PeakIndexOfMountainArray {
    public int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                mid=end;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
