public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        int writeInd = n + count - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (writeInd < n) {
                arr[writeInd] = arr[i];
            }
            writeInd--;
            if (arr[i] == 0) {
                if (writeInd < n) {
                    arr[writeInd] = arr[i];
                }
                writeInd--;
            }
        }
    }
}
