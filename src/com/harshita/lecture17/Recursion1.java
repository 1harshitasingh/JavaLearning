package com.harshita.lecture17;

public class Recursion1 {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[]args){
        int n=5;
        printNumbers(n);
    }
}

