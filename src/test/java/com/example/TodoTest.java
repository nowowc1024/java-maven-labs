package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoTest {

    @Test
    void testAddItem() {
        TodoList l = new TodoList();
        l.add(new TodoItem("Buy milk"));
        assertEquals(1, l.size());
    }

    @Test
    void testCompleteItem() {
        TodoItem i = new TodoItem("Read");
        i.complete();
        assertTrue(i.isDone());
    }

    @Test
    void testCountDone() {
        TodoList l = new TodoList();
        TodoItem i = new TodoItem("X");
        i.complete();
        l.add(i);
        assertEquals(1, l.countDone());
    }

    @Test
    void testBlankTitleThrows() {
        assertThrows(IllegalArgumentException.class, () -> new TodoItem(""));
    }

    @Test
    void testNullTitleThrows() {
        assertThrows(IllegalArgumentException.class, () -> new TodoItem(null));
    }

    @Test
    void testItemNotDoneByDefault() {
        assertFalse(new TodoItem("Task").isDone());
    }

    @Test
    void testGetTitle() {
        assertEquals("Write tests", new TodoItem("Write tests").getTitle());
    }

    @Test
    void testEmptyListSize() {
        assertEquals(0, new TodoList().size());
    }

    @Test
    void testCountDoneEmpty() {
        assertEquals(0, new TodoList().countDone());
    }

    @Test
    void testMultipleItems() {
        TodoList l = new TodoList();
        l.add(new TodoItem("A"));
        l.add(new TodoItem("B"));
        assertEquals(2, l.size());
    }
}