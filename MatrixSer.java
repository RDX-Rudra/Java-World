import java.util.*;

public class MatrixSer {
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
        System.out.println("give number: ");
        int n = sc.nextInt();
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(arr[i][j] == n){
                    System.out.println(n+" found at location ("+i+","+j+")");
                }
            }
        }
    }
}