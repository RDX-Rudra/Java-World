import java.util.*;

public class StringCompare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Second name: ");
        String name2 = sc.nextLine();
        //1 s1 > s2 +ve value
        //2 s1 == s2 0
        //3 s1 < s2 -ve value
        if(name1.compareTo(name2) == 0){// use ==
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
        
    }
}