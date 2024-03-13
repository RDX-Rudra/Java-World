import java.util.*;

public class pattern13 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+i-1; j++){
                if(j>=n-i+1){
                    System.out.print(i+" ");
                }else
                    System.out.print("  ");
            }System.out.print("\n");
        }
    }
}