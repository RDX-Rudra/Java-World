import java.util.*;

public class charAtString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        //charAt
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}