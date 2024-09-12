package com.harshita.lecture13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists7 {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(6);
        System.out.println(list);

        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
}
