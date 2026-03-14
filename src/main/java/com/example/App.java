package com.example;
public class App {
public static void main(String[] args) {
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
Calculator c = new Calculator();
System.out.println("Sum: " + c.sum(a, b));
System.out.println("Diff: " + c.diff(a, b));
System.out.println("Product: " + c.product(a, b));
System.out.println("Average: " + c.average(a, b));
}
}
