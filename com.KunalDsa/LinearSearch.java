import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of array");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the search value: ");
        int value = sc.nextInt();
        int result = search(arr, value);
        if(result == -1){
            System.out.println("Value does not exists");
        }
        else{
            System.out.println("Value exists at index: "+ result);
        }
        System.out.print("Enter the search target: ");
        int target = sc.nextInt();
        int result1 = search1(arr, target);
        System.out.print("target value is: "+ result1);
    }

    static int search1(int[] arr, int target){
        if(target > arr.length-1){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }

    static int search(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
