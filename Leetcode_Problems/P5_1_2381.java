public class P5_1_2381 {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] arr = new int[s.length()+1];
        for(int i=0; i<shifts.length; i++){
            int shift =0;
            if(shifts[i][2]==1)
                shift = 1;
            else shift = -1;
            arr[shifts[i][0]] += shift;
            arr[shifts[i][1]+1] -= shift;
        }
        for(int k=0; k<s.length(); k++){
            if(k>0)
                arr[k] += arr[k-1];
            int shift = arr[k];
            int ascii = s.charAt(k);
            Character newChar = shiftChar((char)ascii, shift);
            s = s.substring(0, k) + newChar + s.substring(k+1);
        }
        return s;
    }
    private Character shiftChar(Character c, int shift){
        int ascii = c;
        if (ascii + shift - 97 < 0) {
            shift += 26;
        }
        if(ascii + shift - 97 > 26){
            shift = shift % 26;
        }
        int newAscii = (ascii + shift - 97) % 26 + 97;
        return (char)newAscii;
    }

    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = {{0, 1, 0}, {1, 2, 1}, {0, 2, 1}};
        P5_1_2381 obj = new P5_1_2381();
        System.out.println(obj.shiftingLetters(s, shifts));
    }
}
