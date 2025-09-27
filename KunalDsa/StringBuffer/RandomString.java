import java.text.DecimalFormat;
import java.util.Random;

public class RandomString {
    static String generate(int size){
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for(int i=0; i<size; i++){
            int randomChar = 97 + random.nextInt(26);
            sb.append((char) randomChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RandomString rs = new RandomString();
        int size = 10;
        String str = RandomString.generate(size);
        System.out.println(str);

        // rounding off
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(12.56789));
    }
}
