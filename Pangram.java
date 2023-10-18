package com.cloudvandana;

public class Pangram {
    public static boolean isPangram(String input) {
        // Create a boolean array to track the presence of each alphabet letter
        boolean[] alphabetPresent = new boolean[26];

        // Convert the input to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        // Iterate through the input and mark the presence of each letter
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                alphabetPresent[index] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(input);
        System.out.println("Is it a pangram? :" + result);
    }
}



