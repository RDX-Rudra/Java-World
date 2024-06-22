public class P21_6_1052 {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int i = 0;
        int curWin = 0;
        int maxWin = 0;

        for (int j = 0; j < n; j++) {
            curWin += customers[j] * grumpy[j];
            maxWin = Math.max(curWin, maxWin);
            if (j >= minutes - 1) {
                curWin -= customers[i] * grumpy[i++];
            }
        }
        int res = maxWin;
        for (i = 0; i < grumpy.length; i++) {
            res += customers[i] * (1 - grumpy[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int minutes = 3;
        int res = maxSatisfied(customers, grumpy, minutes);
        System.out.println("output = " + res);
    }
}
