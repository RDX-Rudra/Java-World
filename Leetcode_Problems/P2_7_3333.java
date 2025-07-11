public class P2_7_3333 {
    public int possibleStringCount(String word, int k) {
        int diff= word.length() - k;
        int count = 0;
        int temp = 0;
        while(diff>0){
            System.out.println("diff: " + diff);
            for(int i = 1; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(i-1) && temp < diff) {
                temp++;
                count++;
                System.out.println("count: " + count);
                }
                else if (word.charAt(i) != word.charAt(i-1)) {
                    temp = 0;
                }
            }
            diff--;
        }
        return (count+1)%(1000000007);
    }

    public static void main(String[] args) {
        P2_7_3333 obj = new P2_7_3333();
        String word = "ammma";  
        int k = 3;
        System.out.println(obj.possibleStringCount(word, k)); // Output: 6
    }
}
