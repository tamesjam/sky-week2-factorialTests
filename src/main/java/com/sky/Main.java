package com.sky;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(120));
    }

    public static int factorial(int input) {
        int factorial = input;
        for(int i = 2; i != factorial; i++) {
            factorial /= i;
        }
        return factorial;
    }
}