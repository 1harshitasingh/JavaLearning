package com.harshita.lecture15;


import java.util.LinkedList;
import java.util.Collections;

    public class RL1 {
        public static void main(String[] args) {
            // Initialize the LinkedList for strings
            LinkedList<String> list = new LinkedList<>();
            list.add("is");
            list.add("a");
            list.addLast("list");
            list.addFirst("this");
            list.add(3, "linked");
            list.add(4, "linked");

            // Print the original list
            System.out.println("Original list: " + list);

            // Print the first element
            System.out.println("First element: " + list.get(0));

            // Print the size of the list
            System.out.println("Size of the list: " + list.size());

            // Remove elements by index, checking if the indices are valid
            if (list.size() > 4) {
                list.remove(4);  // Remove element at index 4
            }
            if (list.size() > 3) {
                list.remove(3);  // Remove element at index 3
            }

            // Remove the first and last elements
            if (!list.isEmpty()) {
                list.removeFirst();
            }
            if (!list.isEmpty()) {
                list.removeLast();
            }

            // Print the list after removals
            System.out.println("List after removals: " + list);

            // Initialize the LinkedList for integers
            LinkedList<Integer> list2 = new LinkedList<>();
            list2.add(1);
            list2.add(2);

            // Reverse the list
            Collections.reverse(list2);

            // Print the reversed list
            System.out.println("Reversed list2: " + list2);
        }
    }
