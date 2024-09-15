package com.harshita.lecture18;

public class Recursion12 {
    public static String removeDuplicates(String str, int idx, boolean present[]) {
        // Base case: If we reach the end of the string
        if(idx == str.length()) {
            return "";
        }

        char curr = str.charAt(idx);

        // Check if the character is already present
        if(present[curr - 'a']) {
            return removeDuplicates(str, idx + 1, present);
        } else {
            present[curr - 'a'] = true;
            return curr + removeDuplicates(str, idx + 1, present);
        }
    }

    public static void main(String args[]) {
        String str = "abcadbcefghabi";
        // Boolean array to track presence of characters from 'a' to 'z'
        boolean present[] = new boolean[26];  // Size should be 26 for lowercase letters
        System.out.println(removeDuplicates(str, 0, present));
    }
}



