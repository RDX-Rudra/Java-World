import java.util.*;

public class SumFunc {
    public static int calSum(int a, int b){
        int sum = a +b;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        int sum = calSum(x,y);
        System.out.println("sum of two number is : "+ sum);
    }
}