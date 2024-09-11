package com.harshita.lecture11;

public class OOPS3 {
    public static void main(String [] args) {
        Student s1 = new OOPS3.Student("Harshita", 22);

        s1.printInfo();
    }

    static class Student {
        String name;
        int age;

        public void printInfo() {
            System.out.println(this.name);
            System.out.println(this.age);
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
