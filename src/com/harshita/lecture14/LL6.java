package com.harshita.lecture14;


public class LL6 {
    private Node head;
    private int size;

    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {  // Check if index is valid
            System.out.println("Invalid Index value");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {  // Special case for adding at the head
            newNode.next = head;
            head = newNode;
        } else {
            Node currNode = head;
            for (int i = 1; i < index; i++) {  // Traverse to the node before the target index
                currNode = currNode.next;
            }

            // Insert the new node in between
            newNode.next = currNode.next;
            currNode.next = newNode;
        }

        size++;  // Increment size after successful insertion
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Inner class for Node
    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        LL6 linkedList = new LL6();

        // Add nodes at different positions
        linkedList.addInMiddle(0, "First");   // Add at index 0
        linkedList.addInMiddle(1, "Second");  // Add at index 1
        linkedList.addInMiddle(1, "Inserted in middle"); // Add at index 1
        linkedList.addInMiddle(3, "Fourth");  // Add at index 3

        // Test invalid index
        linkedList.addInMiddle(10, "Invalid");

        // Print the list
        linkedList.printList();
    }
}
