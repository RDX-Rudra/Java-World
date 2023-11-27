package com.DSA;
public class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    //insert at begining
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //insert at last
    public void addLast(String data){
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

    // print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            System.out.println(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("a");
        list.printList();
    }
}
