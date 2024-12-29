public class decendingOrder {
    public static void main(String[] args) {
        int[] arr = {90, 81, 75, 67, 51};
        System.out.println(binSearchDecend(arr, 67));

    }

    static int binSearchDecend(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // mid = start + end /2 this may exceed the imt range
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
