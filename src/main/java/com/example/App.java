package com.example;

public class App {
    public static void main(String[] args) {

        // Validation: must have at least 1 integer
        if (args.length < 1) {
            System.out.println("Usage: App <num1> <num2> ...");
            System.exit(1);
        }

        // Parse all arguments into an int array
        int[] nums = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                nums[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: all arguments must be integers.");
            System.exit(1);
            return;
        }

        // Use ArrayStats
        ArrayStats stats = new ArrayStats();
        System.out.println("Max: " + stats.max(nums));
        System.out.println("Min: " + stats.min(nums));
        System.out.println("Mean: " + stats.mean(nums));
    }
}