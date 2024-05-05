import java.util.*;

import org.w3c.dom.Node;

public class doublyLL {
    Node head;
    Node tail;
    private int size;
    void LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node prev;
        Node next;

        Node(String data){
            this.data = data;
            this.prev = null;
            this.next = null;
            size++;
        }
    }
    
    //insert at begining
    public void addFirst(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String data = sc.next();
        sc.close();
        Node newNode = new Node(data);
        newNode.prev = null;
        if(head == null){
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // insert at Specific Position
    public void atPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int Position = sc.nextInt();
        sc.close();
        if(Position == 1 || head == null){
            addFirst();
            return;
        }
        System.out.println("Enter the value: ");
        String data = sc.next();
        Node currNode = head;
        for(int i = 1; i<Position-1; i++){
            if(currNode.next == null){
                System.out.println("invalid position");
                return;
            }
            currNode = currNode.next;
        }
        Node newNode = new Node(data);
        newNode.next = currNode.next;
        newNode.prev = currNode;
        currNode.next = newNode;
    }

    //insert at last
    public void addLast(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String data = sc.next();
        sc.close();
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = currNode.next;
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    // print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public int getSize(){
        return size;
    }

    // reverse linkedlist with iteration
    public void reverseLLIter(){
        if(head == null || head.next == null){
            return;
        }
        Node preNode = head;
        Node curNode = head.next;
        while(curNode != null){
            Node nextNode = curNode.next;
            curNode.next = preNode;
            // update
            preNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }

    // reverse linkedlist with recursion
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next =head;
        head.next =null;
        return newHead;
    }

    public static void main(String args[]){
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.add First 2.add at a Position 3.add last 4.delete first 5.delete last 6.print list 7.size of linked list 8.Reverse List with iteration 9.Reverse List with Recursion 10.Exit");
            System.out.print("enter your choices: ");
            int operation = sc.nextInt();
            switch(operation){
                case 1: 
                    list.addFirst();
                    break;
                case 2: 
                    list.atPosition();
                    break;
                case 3: 
                    list.addLast();
                    break;
                case 4: 
                    list.deleteFirst();
                    break;
                case 5: 
                    list.deleteLast();
                    break;
                case 6: 
                    list.printList();
                    break;
                case 7: 
                    System.out.println("size is "+list.getSize());
                    break;
                case 8: 
                    list.reverseLLIter();
                    list.printList();
                    break;
                case 9:
                    list.head = list.reverseRecursive(list.head); 
                    list.printList();
                    break;
                case 10:
                    System.exit(operation);
                    sc.close();
                default:
                    System.out.println("enter a valid operation");
                    break;
            }
        }
        // list.addFirst();
        // list.addFirst();
        // list.addLast();
        // list.addLast();
        // list.printList();
        // list.head = list.reverseRecursive(list.head);
        // list.printList();
        // list.reverseLLIter();
        // list.printList();
    }
}


