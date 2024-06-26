import java.util.*;

public class PowerRecursion {//stack form
    public static int CalcPower(int x, int n){
        if(n == 0)
            return 1;
        if(x == 0)
            return 0;
        int xPowNm1 = CalcPower(x, n-1);
        int xPowN = x * xPowNm1;
        return xPowN;
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