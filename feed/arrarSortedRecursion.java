import java.util.*;

public class arrarSortedRecursion{
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]< arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else
            return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,5,4,6};
        System.out.println(isSorted(arr, 0));
        sc.close();
    }
}