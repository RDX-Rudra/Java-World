import java.util.Arrays;

public class p16_2 {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        int[] node = new int[arr.length+1];
        int cnt = 0;
        int length=1;
        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length && arr[i] == arr[i+1]) {
                length++;
            } else {
                cnt++;
                node[length]++;
                length=1;
            }
        }
        for(int i=1;i<node.length;i++) {
            int canRemove = Math.min(k/i, node[i]);
            cnt-=canRemove;
            k-=canRemove*i;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 4};
        int k = 1;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }
}
