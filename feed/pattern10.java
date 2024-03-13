import java.util.*;

public class pattern10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int m=0;
        for(int i=1; i<=n; i++){
            if(i<= (n/2))
                m++;
            else
                m--;
            for(int j=1; j<=n; j++){
                if(j<=m || j>n-m){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }System.out.print("\n");
        }
    }
}