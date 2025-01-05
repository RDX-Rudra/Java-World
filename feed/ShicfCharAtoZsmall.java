public class ShicfCharAtoZsmall {
    public static Character shiftChar(Character c, int shift){
        int ascii = c;
        if (ascii + shift - 97 < 0) {
            shift += 26;
        }
        if(ascii + shift - 97 > 26){
            shift = shift % 26;
        }
        int newAscii = (ascii + shift - 97) % 26 + 97;
        return (char)newAscii;
    }
    public static void main(String[] args) {
        Character c = 'a';
        int shift = -2;
        System.out.println(shiftChar(c, shift));
    }
}
