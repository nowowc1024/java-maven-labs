package com.example;
public class Rectangle extends Shape {
private final double w, h;
public Rectangle(double w, double h) { this.w = w; this.h = h; }
public double area() { return w * h; }
}
