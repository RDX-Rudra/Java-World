import java.util.*;

public class pattern9 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j%2+" ");
            }System.out.print("\n");
        }
    }
}