public class BacktrackingNQueen {
    public static boolean isSafe(char board[][], int row, int col){
        //horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q')
                return false;
        }
        //vertical
        for(int i=0; i<board.length; i++){
            if(board[i][col]== 'Q')
                return false;
        }
        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q')
                return false;
        }
        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; c++, r--){
            if(board[r][c] == 'Q')
                return false;
        }
        //lower left
        r= row;
        for(int c=col; c>=0 && r<board.length; c--, r++){
            if(board[r][c] == 'Q')
                return false;
        }
        //lower right
        for(int c=col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q')
                return false;
        }
        return true;
    }
    public static void nQueens(char board[][], int row){
        //base
        if(row == board.length){
            count++;
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);//function call
                board[row][j] = '.';
            }
        }
    }

    static int count =0;
    public static void main(String args[]){
        int n = 5;
        char board[][] = new char[n][n];
        //initialization
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
        System.out.println("total ways to solve n Queen = "+ count);
    }
}