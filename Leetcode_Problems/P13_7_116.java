import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class P13_7_116 {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if(root == null){
            return null;
        }

        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            Node prev = null;
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                if(prev != null) {
                    prev.next = curr; // connect the previous node to the current node
                }
                prev = curr; // update the previous node
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            if(prev != null) {
                prev.next = null; // the last node in the level should point to null
            }
        }
        return root;
    }

    public Node connect2(Node root) {
        if(root == null) return root;
        if(root.left!=null){
            root.left.next=root.right;
        } if(root.right!=null && root.next!=null){
            root.right.next=root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    public static void main(String[] args) {
        P13_7_116 solution = new P13_7_116();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        solution.connect(root);
    }
}
