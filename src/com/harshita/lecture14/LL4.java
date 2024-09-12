package com.harshita.lecture14;


class LL4 {


Node head;
private int size;


LL4 () {
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


    if(head == null) {
        head = newNode;
        return;
    }


    Node lastNode = head;
    while(lastNode.next != null) {
        lastNode = lastNode.next;
    }


    lastNode.next = newNode;
}


public void printList() {
    Node currNode = head;


    while(currNode != null) {
        System.out.print(currNode.data+" -> ");
        currNode = currNode.next;
    }


    System.out.println("null");
}


public void removeFirst() {
    if(head == null) {
        System.out.println("Empty List, nothing to delete");
        return;
    }


    }


public static void main(String args[]) {
    LL4 list = new LL4();
    list.addLast("is");
    list.addLast("a");
    list.addLast("list");
    list.printList();


    list.addFirst("this");
    list.printList();

    list.removeFirst();
    list.printList();


}
}
