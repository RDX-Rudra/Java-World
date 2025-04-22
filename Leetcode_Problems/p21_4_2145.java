public class p21_4_2145 {

    public static int numberOfArrays(int[] differences, int lower, int upper) {
        int n=differences.length;
        int max=0, min=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=differences[i];
            max=Math.max(max,sum);
            min=Math.min(min,sum);
            if(max-min>upper-lower){
                return 0;
            }
        }
        return (upper-lower)-(max-min)+1;
    }

    public static void main(String[] args) {
        int[] differences = {1, -3, 4};
        int lower = 1;
        int upper = 6;
        System.out.println(numberOfArrays(differences, lower, upper)); 
    }
}