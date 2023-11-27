import java.util.*;

public class ConcatenationString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your Last name: ");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println("your name is : "+ fullName);
        System.out.println(fullName.length());
    }
}