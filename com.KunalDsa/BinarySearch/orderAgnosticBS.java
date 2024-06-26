public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 4, 5, 7, 8, 14, 16 };
        System.out.println(binSearch(arr, 14));

    }

    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // mid = start + end /2 this may exceed the imt range
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[start] > arr[end]) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
