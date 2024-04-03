public class P3_4_79 {
    public static boolean exist(char[][] board, String word) {
        int n= word.length();
        int i=0, k=0;
        while (i<board.length && k<n) {
            int j =0;
            while (j<board[i].length) {
                
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}
