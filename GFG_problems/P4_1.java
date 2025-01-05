package GFG_problems;

public class P4_1 {
	public int countTriplets(int[] arr, int target) {
        // Code Here
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    System.out.println(i + " " + j + " " + k);
                    count++;
                    j++;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {-3, -1, -1, 0, 1, 2};
        int target = -2;
        P4_1 obj = new P4_1();
        System.out.println(obj.countTriplets(arr, target));
    }
}
