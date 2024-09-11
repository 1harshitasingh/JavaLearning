package com.harshita.lecture11;


class Stu {
    String name;
    int age;

    // Default constructor
    Stu() {
    }

    // Copy constructor
    Stu(Stu s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS4 {
    public static void main(String[] args) {
        Stu s1 = new Stu();  // Default constructor
        s1.name = "Harshita";
        s1.age = 22;

        // Pass s1 to the constructor to create a copy
        Stu s2 = new Stu(s1);  // Corrected to pass s1 instead of s2

        s2.printInfo();  // This will print the info of s2, which is a copy of s1
    }
}

