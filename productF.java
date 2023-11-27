import java.util.*;

public class productF {
    public static int product(int a, int b){
        return a*b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("product of two number is : "+ product(x,y));
    }
}