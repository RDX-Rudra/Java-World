package AmazonSpringHigh;


public class KthFactor1492 {
    public static int kthFactor(int n, int k) {
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
            if(count == k)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=12, k=3;
        int ans = kthFactor(n, k);
        System.out.println(ans);
    }
}
