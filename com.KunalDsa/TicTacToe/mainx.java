package TicTacToe;

import java.util.Scanner;

public class Mainx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe World!");
        System.out.println("Choose your sign 'x' or 'o' :");
        char sign1 = sc.nextLine().charAt(0);
        Playerx player1 = new Playerx(sign1);
        System.out.println("You are player1 and your sign is " + player1.sign);
        char sign2 = (sign1 == 'x') ? 'o' : 'x';
        Playerx player2 = new Playerx(sign2);
        System.out.println("You are player2 and your sign is " + player2.sign);
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println("------");
        }
    }
}
