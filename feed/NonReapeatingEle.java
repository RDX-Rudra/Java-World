import java.util.HashMap;

public class NonReapeatingEle {
    // first non repeating element in array
    public static int nonRepetEle(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int val : arr){
            if(freq.containsKey(val) == false){
                freq.put(val, 1);
            }
            else
                freq.put(val, freq.get(val)+1);
        }
        for(int i : arr){
            if(freq.get(i) ==1)
                return i;
        }
        return -1;
    } 

    public static void main(String[] args) {
        int[] arr = {5,4,4,3,6,7,5,6};
        System.out.println(nonRepetEle(arr));
    }
}
