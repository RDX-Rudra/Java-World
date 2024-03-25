import java.util.Locale;
import java.util.*;
import java.text.ListFormat;
public interface listMathodes {

    
    static void main(String[] args) {
        var list = List.of("java", "Rdx", "fuck");
        Locale.setDefault(Locale.GERMANY);
        var message = ListFormat.getInstance().format(list);
        System.out.println(message);
    }
}