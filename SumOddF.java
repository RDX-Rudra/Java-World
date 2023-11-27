import java.util.*;

public class SumOddF {
    public static int calSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int sum = calSum(x);
        System.out.println("sum of odd numbers within "+ x +" is : "+sum);
    }
}