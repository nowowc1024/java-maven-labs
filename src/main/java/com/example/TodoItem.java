package com.example;
public class TodoItem {
private final String title;
private boolean done = false;
public TodoItem(String title) {
if (title == null || title.isBlank())
throw new IllegalArgumentException("Title must not be blank");
this.title = title;
}
public String getTitle() { return title; }
public boolean isDone() { return done; }
public void complete() { done = true; }
}
