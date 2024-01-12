package org.example;

public class Main {
    public static int getCount(String str) {
        return (int) str.chars().filter(c -> "aeiouAEIOU".indexOf(c) > 0).count();
    }

    public static void main(String[] args) {
        String input = "HellO world!";
        int vowelCount = getCount(input);
        System.out.println("Number of vowels: " + vowelCount);
    }
}