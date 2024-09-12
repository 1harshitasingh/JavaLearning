package com.harshita.lecture13;

import java.util.ArrayList;

class ArrayLists6 {
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


        //Loops on list
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}