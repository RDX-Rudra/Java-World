package TreeLec;

import java.util.Scanner;

class BinaryTree1 {
    public BinaryTree1(){

    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    // insert function
    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("do you want to enter the left of " + node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter the value: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        
        System.out.println("do you want to enter the right of " + node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter the value: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
        
    }

    public void display(){
        System.out.println("Displaying the tree: ");
        display(root, "");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }   
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree1 tree = new BinaryTree1();
        tree.populate(sc);
        tree.display();
        sc.close();
    }
    
}