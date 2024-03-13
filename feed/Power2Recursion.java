import java.util.*;

public class Power2Recursion {//stack form
    public static int CalcPower(int x, int n){
        if(n == 0)
            return 1;
        if(x == 0)
            return 0;
        if(n%2 == 0)
            return CalcPower(x, n/2) * CalcPower(x, n/2);
        else
            return CalcPower(x, n/2) * CalcPower(x, n/2) * x;
    }
    public static void main(String args[]) {
        System.out.print("enter the value of x(x^n):");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("enter the value of n(x^n):");
        int n = sc.nextInt();
        int ans = CalcPower(x, n);
        System.out.println(ans);
    }
}