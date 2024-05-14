import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class p17_1 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
            else{
                hashMap.put(arr[i], 1);
            }
        }
        HashSet<Integer> hashSet = new HashSet<>();
        boolean flag = true;
        for (Map.Entry<Integer, Integer> mapElement : hashMap.entrySet()){
            if (!hashSet.add(mapElement.getValue())){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
