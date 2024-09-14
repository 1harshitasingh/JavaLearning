package com.harshita.lecture17;

public class Recursion4 {

        public static void printFactorial(int n, int fact) {
            if(n == 0) {
                System.out.println(fact);
                return;
            }
            fact *= n;
            printFactorial(n-1, fact);
        }
        public static void main(String args[]) {
            printFactorial(6, 1);
        }
    }

