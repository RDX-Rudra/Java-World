import java.util.*;

public class PrintNumRecursion {//stack form
    public static void printArray(int n){
        if(n==0)//base case
            return;
        System.out.print(n+" ");
        printArray(n-1);
    }
    public static void main(String args[]) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printArray(n);
    }
}