import java.util.*;

public class SubString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String sentence = sc.nextLine();
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}