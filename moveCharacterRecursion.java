import java.util.*;

public class moveCharacterRecursion{
    public static void moveAllEle(String str, int idx, int count, String newString, char element){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += element;
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            count++;
            moveAllEle(str, idx+1, count, newString, element);
        }
        else{
            newString+= currChar;
            moveAllEle(str, idx+1, count, newString, element);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char element = sc.next().charAt(0);
        moveAllEle(str, 0, 0, "", element);
    }
}