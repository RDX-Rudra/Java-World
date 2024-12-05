import java.util.Scanner;
public class IntArray {
    private int[] arr;
    public IntArray(Scanner sc) {
        arr = new int[5];
        System.out.println("Enter the integers: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + i + " integer :");
            arr[i] = sc.nextInt();
        }
    }

    public void bubblesort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void Display() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntArray data = new IntArray(sc);
        System.out.println("Original Array=");
        data.Display();
        data.bubblesort();
        System.out.println("Sorted Array=");
        data.Display();
        sc.close();
    }
}
