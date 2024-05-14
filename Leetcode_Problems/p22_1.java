
public class p22_1 {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[n];
        int[] retarr = new int[2];
        for(int i=0; i<n; i++){
            newarr[nums[i] -1]++;
        }
        for(int j=0; j<n; j++){
            if(newarr[j] > 1){
                retarr[0] = j+1;
            }
            if(newarr[j] < 1){
                retarr[1] = j+1;
            }
        }
        return retarr;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,2,4};
        int[] resarr = findErrorNums(arr);
        for(int i=0; i<2; i++){
            System.out.println(resarr[i]);
        }
    }
}
