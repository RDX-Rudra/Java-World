import java.util.HashSet;

public class HashSetIntro {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(45);
        hs.add(44);
        hs.add(49);
        hs.add(47);
        System.out.println(hs.size());
        hs.remove(45);
        System.out.println(hs.contains(45));
    }    
}
