import java.util.Arrays;

public class LinearSearch2DArr {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {21, 31, 41, 51, 61},
            {32, 42, 52, 62, 72}
        };
        int target = 51;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int[] search(int[][] arr, int target){
        for(int row =0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int maxterm = Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element >maxterm){
                    maxterm = element;
                }
            }
        }
        return maxterm;
    }

    static int min(int[][] arr){
        int minterm = Integer.MAX_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element <minterm){
                    minterm = element;
                }
            }
        }
        return minterm;
    }
}
