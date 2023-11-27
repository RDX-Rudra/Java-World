import java.util.*;

public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {7,8,5,3,4,2};
        //time complexcity = 0(n^2)
        //selection sort
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];//swap
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}