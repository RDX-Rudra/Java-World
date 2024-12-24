import java.util.ArrayList;
import java.util.Collections;

class arrayLists{

    public static void main(String args[]){
        //Integer | Float | String | boolean
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        //ArrayList<String> list1 = new ArrayList<String>();
        //ArrayList<Boolean> list2 = new ArrayList<Boolean>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        list1.add(12);
        list1.add(23);
        list1.add(5);

        System.out.println(list);
        //get element
        int element = list.get(0);
        System.out.println(element);

        //add ele in btn
        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //del ele
        list.remove(3);
        System.out.println(list);

        //size
        int size= list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //append
        list.addAll(list1);
        System.out.println(list);

        //contains
        System.out.println(list.contains(5));

        //search index
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(13));
        System.out.println(list.lastIndexOf(5));

        //set or change element
        list.set(1, 8);
        

        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}