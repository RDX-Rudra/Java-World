import java.util.*;

public class SerInputArr {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the inputs of array : ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        for(int i =0; i<n; i++){
            if(arr[i] == a){
                System.out.println(a+" found at index : "+i);
            }
        }
   }
}