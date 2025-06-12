public class P31_5_909 {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        for(int i=0; i < n; i++){
            
        }
    }
    public static void main(String[] args) {
        P31_5_909 obj = new P31_5_909();
        int[][] board = {
            {-1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1},
            {-1,35,-1,-1,13,-1},
            {-1, -1, -1, -1, -1},
            {-1,15,-1,-1,-1,-1}
        };
        System.out.println(obj.snakesAndLadders(board)); // Output: 4
    }
}
   