import java.util.*;

public class pattern16 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int m=n;
        for(int i=1; i<=2*n-1; i++){
            if(i<= n)
                m--;
            else
                m++;
            for(int j=1; j<=2*n-m; j++){
                if(j>=n-m && j<= 2*n-m){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }System.out.print("\n");
        }
    }
}