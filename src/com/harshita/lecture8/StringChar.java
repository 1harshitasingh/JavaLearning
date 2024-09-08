package com.harshita.lecture8;

public class StringChar {
    public static void main(String[] args) {

        String firstName = "Harshita";
        String lastName = "Singh";
        String fullName = firstName + lastName;
        System.out.println(fullName.length());
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

    }
}

