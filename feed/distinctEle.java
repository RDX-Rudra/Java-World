import java.util.HashSet;

public class distinctEle {
    public static int noOfDistEle(int[] arr){
        HashSet<Integer> distList = new HashSet<>();
        for(int val : arr){
            distList.add(val);
        }
        return distList.size();
    }

    public static void main(String[] args) {
        int[] arr = {4,6,7,6,5};
        System.out.println(noOfDistEle(arr));
    }
}
