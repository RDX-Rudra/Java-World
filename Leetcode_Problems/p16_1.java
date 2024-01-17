import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class p16_1 {
    public class RandomizedSet {

        private ArrayList<Integer> nums;
        private HashMap<Integer, Integer> indexMap;
        private Random random;

        public RandomizedSet() {
            nums = new ArrayList<>();
            indexMap = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (indexMap.containsKey(val)) {
                return false;
            }
            nums.add(val);
            indexMap.put(val, nums.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (!indexMap.containsKey(val)) {
                return false;
            }
            int index = indexMap.get(val);
            if (index < nums.size() - 1) {
                int lastElement = nums.get(nums.size() - 1);
                nums.set(index, lastElement);
                indexMap.put(lastElement, index);
            }
            nums.remove(nums.size() - 1);
            indexMap.remove(val);
            return true;
        }

        public int getRandom() {
            int randomIndex = random.nextInt(nums.size());
            return nums.get(randomIndex);
        }
    }

    public static void main(String[] args) {
        // Instantiate RandomizedSet object
        p16_1 obj = new p16_1();
        RandomizedSet randomizedSet = obj.new RandomizedSet();

        // Insert elements
        System.out.println("Insert 1: " + randomizedSet.insert(1)); // true
        System.out.println("Insert 2: " + randomizedSet.insert(2)); // true
        System.out.println("Insert 2 again: " + randomizedSet.insert(2)); // false

        // Get random element
        System.out.println("Random element: " + randomizedSet.getRandom());

        // Remove element
        System.out.println("Remove 1: " + randomizedSet.remove(1)); // true

        // Insert element again
        System.out.println("Insert 2 again: " + randomizedSet.insert(2)); // false

        // Get random element
        System.out.println("Random element: " + randomizedSet.getRandom());
    }
}
