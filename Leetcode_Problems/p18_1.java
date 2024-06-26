public class p18_1 {
    public static int climbStairs(int n) {
        int ways = 1;

        for (int i = 1; i <= n / 2; i++) {
            double product = 1;

            for (int j = i; j <= i * 2 - 1; j++) {
                product *= ((double) (n - j) / (j - i + 1));
            }

            ways += product;
        }

        return (int) ways;


    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }    
}
