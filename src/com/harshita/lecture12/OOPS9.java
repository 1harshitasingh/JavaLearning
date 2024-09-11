package com.harshita.lecture12;

interface Animal1 {
    void walk();
}


class Horse1 implements Animal1 {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}


class Chicken1 implements Animal1 {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}


public class OOPS9 {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}
