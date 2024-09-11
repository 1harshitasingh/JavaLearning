package com.harshita.lecture12;

abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {

    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}


class Chicken extends Animal {

    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}


public class OOPS8 {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();

    }
}
