package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProductTest {
@Test void testGetters() {
Product p = new Product("Book", 9.99);
assertEquals("Book", p.getName());
assertEquals(9.99, p.getPrice());
}
@Test void testNegativePriceThrows() {
assertThrows(IllegalArgumentException.class, () -> new Product("X", -1));
}
}
