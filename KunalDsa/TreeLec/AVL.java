
import java.util.List;

public class AVL {
    public class node{
        int data;
        node left;
        node right;
        int height;

        public node(int data){
            this.data = data;
        }

        public int getValue(){
            return data;
        }
    }

    private node root;

    public AVL(){

    }

    public int height(node root){
        if(root == null){
            return -1;
        }
        return root.height;
    }

    public boolean isEmpty(){
        return root == null;
    }
// //////display function, this is also a preorder traversal
    public void display(){
        display(root, "Root Node: ");
    }

    private void display(node node, String msg){
        if(node == null){
            return;
        }
        System.out.println(msg + node.data);
        display(node.left, "Left child of " + node.data + ": ");
        display(node.right, "Right child of " + node.data + ": ");
    }
//////inorder traversal
    public List<Integer> inorder(){
        List<Integer> list = new java.util.ArrayList<>();
        if(isEmpty()){
            return null;
        }
        return inorder(root, list);
    }

    private List<Integer> inorder(node node, List<Integer> list){
        if(node == null){
            return list;
        }
        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
        return list;
    }
//////postorder traversal
    public List<Integer> postorder(){
        List<Integer> list = new java.util.ArrayList<>();
        if(isEmpty()){
            return null;
        }
        return postorder(root, list);
    }

    private List<Integer> postorder(node node, List<Integer> list){
        if(node == null){
            return list;
        }
        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.data);
        return list;
    }
///// insert function
    public void insert(int data){
        root = insert(root, data);
    }

    private node insert(node node, int data){
        if(node == null){
            return new node(data);
        }
        if(data < node.data){
            node.left = insert(node.left, data);
        }else if(data > node.data){
            node.right = insert(node.right, data);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return rotate(node);
    }

    private node rotate(node node){
        if(height(node.left) - height(node.right) > 1){
            if(height(node.left.left) > height(node.left.right)){
                return rightRotate(node);
            }
            if(height(node.left.right) > height(node.left.left)){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.right) - height(node.left) > 1){
            if(height(node.right.right) > height(node.right.left)){
                return leftRotate(node);
            }
            if(height(node.right.left) > height(node.right.right)){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private node rightRotate(node p){
        node c = p.left;
        node t = c.right;
        c.right = p;
        p.left = t;
        p.height = 1 + Math.max(height(p.left), height(p.right));
        c.height = 1 + Math.max(height(c.left), height(c.right));
        return c;
    }

    private node leftRotate(node p){
        node c = p.right;
        node t = c.left;
        c.left = p;
        p.right = t;
        p.height = 1 + Math.max(height(p.left), height(p.right));
        c.height = 1 + Math.max(height(c.left), height(c.right));
        return c;
    }

////// balance check
    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(node node){
        if(node == null){
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }
////// populate function
    public void populate(int[] arr){
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }
    }

    public void populateSorted(int[] arr){
        populateSorted(arr, 0, arr.length - 1);
    }
///// populate function for sorted array
    private void populateSorted(int[] arr, int start, int end){
        if(start > end){
            return;
        }
        int mid = (start + end) / 2;
        insert(arr[mid]);
        populateSorted(arr, start, mid - 1);
        populateSorted(arr, mid + 1, end);
    }

    public static void main(String[] args) {
        AVL avl = new AVL();
        // int[] arr = {10, 5, 3, 4, 50, 26, 7};
        // bst.populate(arr);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        avl.populate(arr);
        List<Integer> list1 = avl.inorder();
        System.out.println("Inorder traversal: ");
        for(int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        List<Integer> list2 = avl.postorder();
        System.out.println("postorder traversal: ");
        for(int i = 0; i < list1.size(); i++){
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
        System.out.println("preorder traversal: ");
        avl.display();
        System.out.println("tree is balanced: "+avl.isBalanced());
    }
}

