public class BacktrackingNQueen3 {
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
    public static boolean nQueens(char board[][], int row){
        //base
        if(row == board.length){
            printBoard(board);
            return true;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;//function call
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("----chess board ------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        //initialization
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        } else{
            System.out.println("solution is not possible");
        }
    }
}