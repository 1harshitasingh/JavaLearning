package com.harshita.lecture14;

import java.util.*;

class LL7 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();


        list.addFirst("Harshita");
        list.addFirst("name");
        list.addFirst("my");
        System.out.println(list);

        list.add(2, "is");
        System.out.println(list);
    }
}
