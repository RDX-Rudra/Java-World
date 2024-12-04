package AdventOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class puzzle1 {
    public static int totalDistance(List<Integer> list1, List<Integer> list2){
        Collections.sort(list1);
        Collections.sort(list2);
        int count=0;
        for(int i=0; i<list1.size(); i++){
            count+=Math.abs(list1.get(i)-list2.get(i));
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        File file = new File("AdventOfCode/input1.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split("\\s+");
                    if (parts.length == 2) {
                        list1.add(Integer.parseInt(parts[0]));
                        list2.add(Integer.parseInt(parts[1]));
                    } else {
                        System.out.println("Skipping malformed line: " + line);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }

        if (list1.size() != list2.size()) {
            System.out.println("Error: Mismatch in input sizes.");
            return;
        }

        int ans = totalDistance(list1, list2);
        System.out.println("Total Distance: " + ans);
    }
}
