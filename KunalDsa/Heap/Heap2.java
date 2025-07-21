import java.util.ArrayList;

public class Heap2<T extends Comparable<T>> { // This class implements a max-heap using an ArrayList
    private ArrayList<T> list;

    public Heap2() {
        list = new ArrayList<>();
    }

    private void swap(int i, int j){
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int i){
        return (i - 1) / 2;
    }

    private int left(int i){
        return 2 * i + 1;
    }

    private int right(int i){
        return 2 * i + 2;
    }

    public void insert (T value){
        list.add(value);
        upheap((list.size()-1)/2);
    }

    private void upheap(int index){
        if(index == 0) return;
        int parent = parent(index);
        if(list.get(index).compareTo(list.get(parent))>0){
            swap(index, parent);
            upheap(parent);
        }
    }

    public T remove() throws Exception {
        if(list.isEmpty()){
            throw new Exception("Heap is empty");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index){
        int left = left(index);
        int right = right(index);
        int max = index;
        if(left >= list.size()) return; // No children
        if(left < list.size() &&list.get(left).compareTo(list.get(index))>0){
            max = left;
        }
        if(right < list.size() && list.get(right).compareTo(list.get(index))>0){
            max = right;
        }
        if(max != index){
            swap(max, index);
            downheap(max);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        Heap2<Integer> heap = new Heap2<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(7);

        System.out.println(heap.remove());

        System.out.println("Heap elements (before sorting): " + heap.list);

        System.out.println("Heap elements (sorted): " + heap.heapSort());
    }

}
