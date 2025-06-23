import java.util.Queue;
import java.util.LinkedList;

public class P31_5_909 {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] flat = new int[n * n];
        int index = 0;
        boolean leftToRight = true;

        // Flatten the board into a 1D array
        for (int i = n - 1; i >= 0; i--) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    flat[index++] = board[i][j];
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    flat[index++] = board[i][j];
                }
            }
            leftToRight = !leftToRight;
        }

        boolean[] visited = new boolean[n * n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); // Start at square 1 (index 0)
        visited[0] = true;
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int curr = queue.poll();
                if (curr == n * n - 1) {
                    return moves;
                }

                for (int i = 1; i <= 6 && curr + i < n * n; i++) {
                    int next = curr + i;
                    if (flat[next] != -1) {
                        next = flat[next] - 1; // move to snake/ladder destination
                    }
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(next);
                    }
                }
            }
            moves++;
        }

        return -1; // unreachable
    }

    public static void main(String[] args) {
        P31_5_909 obj = new P31_5_909();
        int[][] board = {
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 35, -1, -1, 13, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 15, -1, -1, -1, -1}
        };
        System.out.println(obj.snakesAndLadders(board)); // Output: 4
    }
}
