import java.util.*;

public class permutationStrRecursion{
    public static void printPerm(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i =0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newSTR = str.substring(0,i)+ str.substring(i+1);
            printPerm(newSTR, permutation+currChar);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPerm(str, "");
    }
}