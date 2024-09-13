package com.harshita.lecture15;

public class RL {


    Node head;
    private int size;

    RL() {
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

    // Recursive method to reverse the linked list
    public Node reverseListRecursive(Node head) {
        // Base case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call to reverse the rest of the list
        Node newHead = reverseListRecursive(head.next);

        // Reverse the current node's next pointer
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Wrapper method to call recursive reverse and update the head
    public void reverseList() {
        head = reverseListRecursive(head);
    }

    public static void main(String[] args) {
        RL list = new RL();

        // Adding elements to the list
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("list");

        // Print the original list
        System.out.println("Original List:");
        list.printList();

        // Reverse the list using recursion
        list.reverseList();

        // Print the reversed list
        System.out.println("Reversed List:");
        list.printList();
    }
}
