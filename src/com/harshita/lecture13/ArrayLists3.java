package com.harshita.lecture13;

import java.util.ArrayList;

class ArrayLists3 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);

//add element in between


        list.add(1, 2); // 1 is the index and 2 is the element to be added


        System.out.println(list);
    }
}
