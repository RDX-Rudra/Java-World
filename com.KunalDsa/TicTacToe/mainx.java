package TicTacToe;

import java.util.Scanner;

public class mainx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Tic Tac Toe World!");
        System.out.println("cHoose your sign 'x' or 'o' :");
        char sign1 = sc.nextLine().charAt(0);
        player player1 = new player(sign1);
        System.out.println("you are player1 and your sign is "+ player1.sign);
        char sign2;
        if(sign1 == 'x')
            sign2 = 'o';
        else 
            sign2 = 'x';
        player player2 = new player(sign2);
        System.out.println("you are player2 and your sign is "+ player2.sign);
        char[][] board = new char[3][3];
        
    }
}
