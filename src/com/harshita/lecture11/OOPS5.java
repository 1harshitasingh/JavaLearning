package com.harshita.lecture11;

class Stud {
    String name;
    int age ;


    public void displayInfo(String name) {
        System.out.println(name);
    }


    public void displayInfo(int age) {
        System.out.println(age);
    }


    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}


public class OOPS5 {
    public static void main(String[]args){
        Stud s1=new Stud();
        s1.name="harshita";
        s1.age=22;
        s1.displayInfo(s1.name ,s1.age);

    }

}
