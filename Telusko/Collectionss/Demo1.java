package Telusko.Collectionss;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums.indexOf(2));
        System.out.println(nums);
    }
}
