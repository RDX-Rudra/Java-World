import java.util.Scanner;

public class Mainx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe World!");
        System.out.println("Choose your sign 'x' or 'o' :");
        char sign1 = sc.nextLine().charAt(0);
        Playerx player1 = new Playerx(sign1);
        System.out.println("You are " + player1.name);
        char sign2 = (sign1 == 'x') ? 'o' : 'x';
        Playerx player2 = new Playerx(sign2);
        System.out.println("Other player " + player2.name);
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        boolean gameOver = false;
        Playerx player = player1;
        while(!gameOver){
            printBoard(board);
            System.out.print(player.name + " enter your position- ");
            String store = sc.nextLine();
            int row = (int) store.charAt(0) - 48;
            int col = (int) store.charAt(1) - 48;
            if(board[row][col] == ' '){
                board[row][col] = player.sign;
                if(winner(board)== player.sign){
                    printBoard(board);
                    System.out.println(player.name + " won the match");
                    gameOver = true;
                }
            }
            else{
                System.out.println("wrong input");
            }
            player = (player == player1)? player2 : player1;
        }
        sc.close();
    }

    public static char winner(char[][] board){
        boolean res = false;
        char winner = ' ';
        int row =0, col=0;
        char sign;
        int n= board.length;
        while(row < n && !res){
            if(board[row][0] != ' '){
                sign = board[row][0];
                if(board[row][1] == sign && board[row][2] == sign){
                    res = true;
                    winner = sign;
                }
            }
            row++;
        }
        while (!res && col<n) {
            if(board[0][col] != ' '){
                sign = board[0][col];
                if(board[1][col] == sign && board[2][col] == sign){
                    res =true;
                    winner = sign;
                }
                else if(col==0 && !res){
                    if(board[1][1] == sign && board[2][2] == sign){
                        res = true;
                        winner= sign;
                    }
                }
                else if(col==3 && !res){
                    if(board[1][1] == sign && board[2][0] == sign){
                        res = true;
                        winner= sign;
                    }
                }
            }
            col++;
        }
        return winner;
    }

    public static void printBoard(char[][] board) {
        System.out.println("  0 1 2");
        System.out.println("-------");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i);
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }
}