package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CartTest {
@Test void testTotal() {
Cart cart = new Cart();
cart.add(new Product("A", 10.0));
cart.add(new Product("B", 5.5));
assertEquals(15.5, cart.total());
}
@Test void testEmptyCartTotal() {
assertEquals(0.0, new Cart().total());
}
}
