package com.harshita.lecture14;

public class LL5 {

    Node head;
    private int size;

    // Constructor to initialize size
    LL5() {
        size = 0;
    }

    // Inner class for Node structure
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;  // Increase size when a new node is created
        }
    }

    // Add a new node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add a new node at the end of the list
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

    // Method to print the entire linked list
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // Get the size of the linked list
    public int getSize() {
        return size;
    }

    // Main method to test the linked list functionality
    public static void main(String args[]) {
        LL5 list = new LL5();

        // Add elements at the end of the list
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList(); // Output: is -> a -> list -> null

        // Add element at the beginning of the list
        list.addFirst("this");
        list.printList(); // Output: this -> is -> a -> list -> null
        System.out.println(list.getSize()); // Output: 4
    }
}
