import java.util.HashSet;

public class PairSum {
    // Given a array[n], check if there exists a pair[i,j] such that arr[i] + arr[j] == k and i!=j.
    public static boolean pairExist(int[] arr, int k){
        HashSet<Integer> num = new HashSet<>();
        for(int val: arr){
            num.add(val);
            if(num.contains(k-val))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 1, -2, 4, 5, 11, -6, 7, 5};
        int k = 11;
        System.out.println(pairExist(arr, k));
    }
}
