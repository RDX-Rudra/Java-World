import java.util.*;

public class MaxItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of array");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Max item is "+ max(arr));
        System.out.print("Enter the start point: ");
        int start = sc.nextInt();
        System.out.print("Enter the end point: ");
        int end = sc.nextInt();
        System.out.println("Max item is "+ maxRange(arr, start, end));
    }

    private static int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxItem = arr[start];
        for(int i=start+1; i<end; i++){
            if(arr[i] > maxItem){
                maxItem = arr[i];
            }
        }
        return maxItem;
    }
    private static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxItem = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxItem){
                maxItem = arr[i];
            }
        }
        return maxItem;
    }
}
