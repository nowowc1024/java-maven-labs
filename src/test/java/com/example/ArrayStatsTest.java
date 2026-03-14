package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArrayStatsTest {
ArrayStats s = new ArrayStats();
@Test void testMax() { assertEquals(9, s.max(new int[]{3,9,1})); }
@Test void testMin() { assertEquals(1, s.min(new int[]{3,9,1})); }
@Test void testMean() { assertEquals(4.0, s.mean(new int[]{3,9,1,3})); }
@Test void testSingleElement() { assertEquals(5, s.max(new int[]{5})); }
@Test void testNegatives() { assertEquals(-1, s.max(new int[]{-5,-1,-3})); }
}
