package TicTacToe;
public class player{
    char sign;
    String name;

    public player(char sign){
        this.sign = sign;
        this.name = "player" + sign;
    }
}