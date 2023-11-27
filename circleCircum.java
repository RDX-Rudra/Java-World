import java.util.*;

public class circleCircum {
    public static double circumferance(double a){
        double cir = (2.00 * 3.14) * a;
        return cir;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radious: ");
        double r = sc.nextDouble();
        double cir = circumferance(r);
        System.out.println("circumferance of circle is : "+ cir);
    }
}