import java.util.HashMap;

public class freqArrHash {
    public static int[] findFreq(int[] arr, int[] quer){
        int n= quer.length;
        int[] res = new int[n];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int val : arr){
            if(freq.get(val)== null){
                freq.put(val, 1);
            }
            else
                freq.put(val, freq.get(val)+1);
        }
        for(int i=0; i<n; i++){
            int key = quer[i];
            if(freq.get(key) == null)
                res[i] = 0;
            else
                res[i] = freq.get(key);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,3,8,2,8,2,3,8,10,6};
        int[] queries = {2,8,3,5};
        int[] res = findFreq(arr, queries);
        for(int val : res)
            System.out.println(val);
    }
}
