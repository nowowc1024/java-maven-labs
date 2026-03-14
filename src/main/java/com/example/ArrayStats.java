package com.example;

public class ArrayStats {

    public int max(int[] a) {
        if (a == null || a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        int m = a[0];
        for (int v : a) if (v > m) m = v;
        return m;
    }

    public int min(int[] a) {
        if (a == null || a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        int m = a[0];
        for (int v : a) if (v < m) m = v;
        return m;
    }

    public double mean(int[] a) {
        if (a == null || a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        int sum = 0;
        for (int v : a) sum += v;
        return (double) sum / a.length;
    }
}