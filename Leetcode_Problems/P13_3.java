public class P13_3 {
    public static int pivotInteger(int n) {
        int sumN = (n * (n+1))/2;
        for(int i=1; i<=n; i++){
            int sumI = (i * (i+1))/2;
            if((sumN - sumI) == (sumI-i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }
}
