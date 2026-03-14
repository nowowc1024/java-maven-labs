package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class ShapeTest {
@Test void testCircleArea() { assertEquals(Math.PI * 4, new Circle(2).area(), 0.001); }
@Test void testRectangleArea() { assertEquals(12.0, new Rectangle(3, 4).area()); }
@Test void testTotalArea() {
List<Shape> shapes = List.of(new Circle(1), new Rectangle(2, 3));
double total = shapes.stream().mapToDouble(Shape::area).sum();
assertEquals(Math.PI + 6.0, total, 0.001);
}
}
