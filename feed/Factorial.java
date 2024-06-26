import java.util.*;

public class Factorial {
    public static int fact(int a){
        if(a<0){
            System.out.println("invalid number");
            return 0;
        }
        int factorial = 1;
        for(int i=a; i>=1; i--){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("factorial of the number is : "+ fact(x));
    }
}