import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(10, 70);
        hm.put(20, 80);
        hm.put(30, 90);

        System.out.println(hm.get(20));
        System.out.println(hm.get(30));
        System.out.println(hm.get(40));

        System.out.println(hm.containsKey(20));
        hm.remove(10);
        System.out.println(hm.containsKey(10));

        for(int val: hm.keySet()){
            System.out.println(val);
        }
        for(int val: hm.keySet()){
            System.out.println(hm.get(val));
        }

    }
}
