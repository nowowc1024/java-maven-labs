package com.example;
import java.util.ArrayList;
import java.util.List;
public class Cart {
private final List<Product> items = new ArrayList<>();
public void add(Product p) { items.add(p); }
public double total() {
double sum = 0;
for (Product p : items) sum += p.getPrice();
return sum;
}
}
