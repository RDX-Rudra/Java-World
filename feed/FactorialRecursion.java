import java.util.*;

public class FactorialRecursion {//stack form
    public static void printFact(int n, int fact){
        if(n==0){//base case
            System.out.println("factorial is "+fact);
            return;
        }
        fact *= n;
        printFact(n-1, fact);
    }
    public static void main(String args[]) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFact(n, 1);
    }
}