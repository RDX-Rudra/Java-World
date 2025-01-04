package AdventOfCode.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Puzzle2 {
    public static int similarityScore(List<Integer> list1, List<Integer> list2){
        HashMap<Integer, Integer> set1 = new HashMap<>();
        HashMap<Integer, Integer> set2 = new HashMap<>();
        HashSet<Integer> set3 = new HashSet<>();
        for(int a=0;a<list1.size(); a++){
            if(set1.get(list1.get(a)) != null){
                set1.put(list1.get(a), set1.get(list1.get(a))+1);
            }
            else{
                set1.put(list1.get(a), 1);
                set3.add(list1.get(a));
            }
            if(set2.get(list2.get(a)) != null){
                set2.put(list2.get(a), set2.get(list2.get(a))+1);
            }
            else{
                set2.put(list2.get(a), 1);
            }
        }
        ArrayList<Integer> list3 = new ArrayList<>(set3);
        int count=0;
        for(int i=0; i<set3.size(); i++){
            if(set1.get(list3.get(i)) != null && set2.get(list3.get(i)) != null){
                count += (list3.get(i) * set1.get(list3.get(i)) * set2.get(list3.get(i)));
            }
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

        int ans = similarityScore(list1, list2);
        System.out.println("Total Distance: " + ans);
    }
}
