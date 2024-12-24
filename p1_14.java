import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class p1_14 {
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=m-1; i>=0;i--){
            for(int j=0; j<i; j++){
                if(Arrays.compare(matrix[i], matrix[j]) == 0){
                    arr.add(i);
                    break;
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 0}, {1, 0}};
        System.out.println(repeatedRows(matrix, 2, 2));
    }
}
