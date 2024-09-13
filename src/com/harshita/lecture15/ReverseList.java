package com.harshita.lecture15;

public class ReverseList {

    Node head;
    private int size;

    ReverseList() {
        size = 0;
    }

    // Node class
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add to the start of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add to the end of the list
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

    // Print the list
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // Method to reverse the linked list
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next;  // Store the next node
            currNode.next = prevNode;       // Reverse the current node's pointer
            prevNode = currNode;            // Move prevNode to current node
            currNode = nextNode;            // Move to next node
        }

        head = prevNode;  // Update head to the new head (previous tail)
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList();

        // Adding elements to the list
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("list");

        // Print the original list
        System.out.println("Original List:");
        list.printList();

        // Reverse the list
        list.reverseList();

        // Print the reversed list
        System.out.println("Reversed List:");
        list.printList();
    }
}
