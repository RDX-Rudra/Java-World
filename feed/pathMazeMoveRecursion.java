import java.util.*;

public class pathMazeMoveRecursion{
    public static int countPaths(int i, int j, int n, int m){
        if(i==n || j==m)
            return 0;
        if(i==n-1 && j==m-1)
            return 1;
        //move downwards
        int downPaths = countPaths(i+1, j, n, m);
        //move right
        int rightPaths = countPaths(i, j+1, n, m);
        return downPaths + rightPaths;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}