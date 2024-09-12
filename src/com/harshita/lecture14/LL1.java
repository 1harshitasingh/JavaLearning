package com.harshita.lecture14;

public class LL1 {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reference to the head of the linked list
    private Node head;

    // Method to add element at the beginning of the linked list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        list.printList();
    }
}

