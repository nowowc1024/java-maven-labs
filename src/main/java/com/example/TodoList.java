package com.example;
import java.util.ArrayList;
import java.util.List;
public class TodoList {
private final List<TodoItem> items = new ArrayList<>();
public void add(TodoItem item) { items.add(item); }
public int size() { return items.size(); }
public TodoItem get(int i) { return items.get(i); }
public long countDone() {
return items.stream().filter(TodoItem::isDone).count();
}
}
