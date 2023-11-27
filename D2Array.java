import java.util.*;

public class D2Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int a = sc.nextInt();
        System.out.println("enter the number of columns: ");
        int b = sc.nextInt();
        int arr[][] = new int[a][b];
        System.out.println("give inputs");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("output is: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(arr[i][j]+" ");
            } System.out.println();
        }
    }
}