import java.util.*;
  
public class setBit {
    public static void main(String args[]){
        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;
        //set bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}