package com.harshita.lecture9;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("meena");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0

        sb.setCharAt(0,'t');
        System.out.println(sb);
    }
}


