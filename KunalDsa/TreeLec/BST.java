package TreeLec;

public class BST {
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

    public BST(){

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

    
}
