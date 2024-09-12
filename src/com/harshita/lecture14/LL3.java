package com.harshita.lecture14;

public class LL3 {


    Node head;
    private int size;


    LL3() {
        size = 0;
    }


    public class Node {
        String data;
        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void addLast(String data) {
        Node newNode = new Node(data);


        if (head == null) {
            head = newNode;
            return;
        }


        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }


        lastNode.next = newNode;
    }


    public void printList() {
        Node currNode = head;


        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }


        System.out.println("null");
    }
    public static void main(String[] args) {
        LL3 list = new LL3();

        // Adding elements to the list
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("list");

        // Printing the list
        list.printList();  // Output: this -> is -> a -> list -> null
    }
}