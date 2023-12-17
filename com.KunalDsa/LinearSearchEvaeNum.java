// LeetCode Problem: given an array nums of integers,return how many of them contain an even numbers of digits.// 

public class LinearSearchEvaeNum {
    public static void main(String[] args) {
        int[] nums = {12, 453, 8644, -16, 45, 98, 1};
        System.out.println(findNumbers(nums));
        System.out.println(digits(-4562));
        System.out.println(digits2(-4562));
    }
    
    public static int findNumbers(int[] nums){
        int count = 0;
        if(nums.length == 0){
            return 0;
        }
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num){
        int numOfDigit = digits(num);
        if (numOfDigit %2 == 0) {
            return true;
        }
        return false;
    }

    static int digits2(int num){
        if(num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num) + 1);
    }

    static int digits(int num){
        int count = 0;
        if(num < 0){
            num *= -1;
        }
        if(num == 0){
            return 1;
        }
        while (num > 0) {
            count++;
            num/= 10;
        }
        return count;
    }
}
