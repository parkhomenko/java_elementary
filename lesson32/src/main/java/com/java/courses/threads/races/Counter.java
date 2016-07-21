package com.java.courses.threads.races;

public class Counter {
    private int value;

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }
}
