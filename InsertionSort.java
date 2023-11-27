import java.util.*;

public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {7,8,5,3,4,2};
        //time complexcity = 0(n^2)
        //Insertion sort
        for(int i=1; i<arr.length; i++){
            int Current = arr[i];
            int j = i-1;
            while(j >=0 && Current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1]= Current;
        }
        printArray(arr);
    }
}