package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
public class PrinterTest {
static class FakePrinter implements Printer {
List<String> output = new ArrayList<>();
public void print(String s) { output.add(s); }
}
@Test void testFakePrinterRecordsOutput() {
FakePrinter fp = new FakePrinter();
fp.print("Hello");
assertEquals("Hello", fp.output.get(0));
}
}
