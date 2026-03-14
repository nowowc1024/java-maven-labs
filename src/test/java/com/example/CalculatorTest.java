package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
Calculator c = new Calculator();
@Test void testSum() { assertEquals(15, c.sum(10, 5)); }
@Test void testDiff() { assertEquals(5, c.diff(10, 5)); }
@Test void testProduct() { assertEquals(50, c.product(10, 5)); }
@Test void testAverage() { assertEquals(7.5, c.average(10, 5)); }
}
