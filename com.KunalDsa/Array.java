import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 67, 56, 87};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }  
    
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start< end) {
            swap(arr, start, end);
            start ++;
            end --;
        }
    }
    
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
