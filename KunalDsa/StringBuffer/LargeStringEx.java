import java.util.*;

public class LargeStringEx {
    public static void main(String[] args) {
        // constructor 1 empty string buffer
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("WeMakeDevs");

        // constructor 2 with string
        StringBuffer sb1 = new StringBuffer("Rdx");

        // constructor 3 with capacity
        StringBuffer sb2 = new StringBuffer(10);

        sb.insert(2, "Hello");

        sb.replace(2, 3, "Hi");

        sb.delete(3, 4);

        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}
