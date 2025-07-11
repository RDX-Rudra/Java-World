public class SegmentTree {

    private static class Node {
        int val;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int val, int start, int end) {
            this.val = val;
            this.start = start;
            this.end = end;
        }
    }

    private Node root;

    public SegmentTree(int[] arr) {
        this.root = consTree(arr, 0, arr.length - 1);
    }

    private Node consTree(int[] arr, int start, int end) {
        if (start == end) {
            return new Node(arr[start], start, end);
        }

        int mid = (start + end) / 2;
        Node left = consTree(arr, start, mid);
        Node right = consTree(arr, mid + 1, end);

        Node node = new Node(left.val + right.val, start, end);
        node.left = left;
        node.right = right;

        return node;
    }

    public void display() {
        System.out.println("Displaying the Segment Tree: ");
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) return;

        System.out.println(indent + "Node(" + node.val + ") [" + node.start + ", " + node.end + "]");
        display(node.left, indent + "  ");
        display(node.right, indent + "  ");
    }

    public int query(int qStart, int qEnd) {
        return query(root, qStart, qEnd);
    }

    private int query(Node node, int qStart, int qEnd) {
        if (node == null) return 0;

        // No Overlap
        if (qEnd < node.start || qStart > node.end) {
            return 0;
        }

        // Total Overlap
        if (qStart <= node.start && node.end <= qEnd) {
            return node.val;
        }

        // Partial Overlap
        int leftVal = query(node.left, qStart, qEnd);
        int rightVal = query(node.right, qStart, qEnd);
        return leftVal + rightVal;
    }


    public void update(int index, int value){
        root.val = update(root, index, value);
    }

    private int update(Node node, int index, int value){
        if(node.start == index && node.end == index){
            node.val = value;
            return value;
        }

        if(index < node.start || index > node.end){
            return node.val;
        }

        int leftval = update(node.left, index, value);
        int rightval = update(node.right, index, value);
        node.val = leftval + rightval;
        return node.val;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();

        System.out.println("Query(1, 3): " + tree.query(1, 3)); // Expected: 3 + 5 + 7 = 15
        System.out.println("Query(0, 5): " + tree.query(0, 5)); // Expected: sum of entire array = 36
        tree.update(1, 10); // Update index 1 to value 10
        System.out.println("After update:");    
        tree.display();
    }
}
