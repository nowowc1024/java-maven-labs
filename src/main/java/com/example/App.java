package com.example;

public class App {
    public static void main(String[] args) {

        // Validation: must have exactly 2 arguments
        if (args.length < 2) {
            System.out.println("Usage: App <num1> <num2>");
            System.exit(1);
        }

        int a, b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: both arguments must be integers.");
            System.exit(1);
            return;
        }

        Calculator c = new Calculator();
        System.out.println("Sum: "     + c.sum(a, b));
        System.out.println("Diff: "    + c.diff(a, b));
        System.out.println("Product: " + c.product(a, b));
        System.out.println("Average: " + c.average(a, b));
        System.out.println(a + " is even: " + c.isEven(a));
        System.out.println(b + " is even: " + c.isEven(b));
    }
}
