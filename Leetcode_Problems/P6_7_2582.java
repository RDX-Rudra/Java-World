public class P6_7_2582 {
    public static int passThePillow(int n, int time) {
        int mode = time/(n-1);
        int res = 0;
        if(mode % 2 == 0)
            res = 1 + (time % (n-1));
        else
            res = n - (time % (n-1));
        return res;
    }

    public static void main(String[] args) {
        int n=3, time = 2;
        System.out.println(passThePillow(n, time));
    }
}
