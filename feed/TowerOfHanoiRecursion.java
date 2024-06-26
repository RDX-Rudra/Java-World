import java.util.*;

public class TowerOfHanoiRecursion {//stack form
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        int i =1;
        if(n == 1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        System.out.print("enter the value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, "s", "h", "d");
    }
}