package GFG_problems;
import LL.java;

import org.w3c.dom.Node;

public class p13_1 {
    /*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
    public static Node insertionSort(Node head)
    {
        //code here
        Node dummy = new Node(-1);
        
        while(head != null){
            Node temp = dummy;
            Node next = head.next;
            
            while(temp.next != null && temp.next.data < head.data){
                temp = temp.next;
            }
            head.next = temp.next;
            temp.next = head;
            head = next;
        }
        
        return dummy.next;
    }
}
