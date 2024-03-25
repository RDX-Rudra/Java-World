import java.util.ArrayList;
import java.util.List;

public class P25_3 {
    public static List<Integer> findDuplicates(int[] nums) {
        int n= nums.length;
        int[] arr = new int[n];
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[nums[i]-1]>=1){
                res.add(nums[i]);
            }
            arr[nums[i]-1]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
}
