import java.util.*;

public class AvarageF {
    public static int calAvg(int a, int b, int c){
        int avg = (a +b + c)/3;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();
        int avg = calAvg(x,y,z);
        System.out.println("avarage of three number is : "+ avg);
    }
}