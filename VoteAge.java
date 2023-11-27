import java.util.*;

public class VoteAge {
    public static void calc(int a){
        if(a>=18)
            System.out.println("you can vote");
        else
            System.out.println("you can not vote");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int x = sc.nextInt();
        calc(x);
    }
}