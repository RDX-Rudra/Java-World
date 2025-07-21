import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P21_7_347 {
    public int[] topKFrequent(int[] nums, int k) {
    // Step 1: Count frequencies
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : nums) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Step 2: Use a min-heap to keep top k frequent elements
    PriorityQueue<Integer> heap = new PriorityQueue<>(
        (a, b) -> freqMap.get(a) - freqMap.get(b)
    );

    for (int num : freqMap.keySet()) {
        heap.offer(num);
        if (heap.size() > k) {
            heap.poll(); // remove least frequent
        }
    }

    // Step 3: Extract results
    int[] result = new int[k];
    for (int i = k - 1; i >= 0; i--) {
        result[i] = heap.poll();
    }

    return result;
}

}
