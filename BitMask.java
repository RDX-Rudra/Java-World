import java.util.*;
  
public class BitMask {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        //get bit
        if((bitMask & n) == 0){
            System.out.println("bit is zero");
        } else {
            System.out.println("bit is one");
        }
    }
}