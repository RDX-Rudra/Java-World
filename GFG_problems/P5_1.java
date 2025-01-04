package GFG_problems;

import java.util.Arrays;

public class P5_1 {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j=i+1;
            while(j < arr.length && arr[j] + arr[i] < target){
                j++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 2, 4, 1};
        int target = 5;
        P5_1 obj = new P5_1();
        System.out.println(obj.countPairs(arr, target));
    }
}
