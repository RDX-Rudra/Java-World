import java.util.Arrays;
import java.util.PriorityQueue;

public class P11_7_2402 {
    public int mostBooked(int n, int[][] meetings) {
        PriorityQueue<Integer> next = new PriorityQueue<>();
        int[] count = new int[n];
        int[] status = new int[n];
        int result = 0;
        int maxCount = 0;
        Arrays.sort(meetings, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
    }

    public static void main(String[] args) {
        P11_7_2402 solution = new P11_7_2402();
        int n = 3;
        int[][] meetings = {{0, 10}, {1, 5}, {2, 7}, {3, 8}};
        int result = solution.mostBooked(n, meetings);
        System.out.println("Most booked room: " + result);
    }
}
