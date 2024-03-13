import java.util.*;

public class placeTilesRecursiom{
    public static int placeTiles(int n, int m){
        if(n == m)
            return 2;
        if(n<m)
            return 1;
        //horizontallt
        int horPlacements = placeTiles(n-1, m);
        //vertically
        int verplacements = placeTiles(n-m, m);
        return horPlacements + verplacements;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalPaths = placeTiles(n, m);
        System.out.println(totalPaths);
    }
}