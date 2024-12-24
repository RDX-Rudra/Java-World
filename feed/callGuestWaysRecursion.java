import java.util.*;

public class callGuestWaysRecursion{
    public static int callGuest(int n){
        if(n <= 1)
            return 1;
        //single
        int ways1 = callGuest(n-1);
        //pair
        int ways2 = (n-1) * callGuest(n-2);
        return ways1 + ways2;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalPaths = callGuest(n);
        System.out.println(totalPaths);
    }
}