package com.harshita.lecture11;

import java.lang.reflect.Constructor;

class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
    Student(){
        System.out.println("Constructor called");
    }
}


public class OOPS1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Harshita";
        s1.age = 22;
        s1.getInfo();


        Student s2 = new Student();
        s2.name = "Khushi";
        s2.age = 22;
        s2.getInfo();
    }
}

