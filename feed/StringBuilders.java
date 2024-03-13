import java.util.*;

public class StringBuilders {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Rudra");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0 (change)
        sb.setCharAt(0, 's');
        System.out.println(sb);

        //insert char (add)
        sb.insert(0, 'p');
        System.out.println(sb);

        //delete char
        sb.delete(0,2);
        System.out.println(sb);

        //add at end
        sb.append("x");
        System.out.println(sb);
    }
}