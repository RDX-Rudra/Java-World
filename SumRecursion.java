import java.util.*;

public class SumRecursion {//stack form
    public static void printSum(int n, int sum){
        if(n==0){//base case
            System.out.println("sum is "+sum);
            return;
        }
        sum += n;
        printSum(n-1, sum);
    }
    public static void main(String args[]) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n, 0);
    }
}