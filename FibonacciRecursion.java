import java.util.*;

public class FibonacciRecursion {//stack form
    public static void printFibonacci(int a, int b, int n){
       if(n == 0)
            return;
        int c = a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }
    public static void main(String args[]) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a, b, n-2);
    }
}