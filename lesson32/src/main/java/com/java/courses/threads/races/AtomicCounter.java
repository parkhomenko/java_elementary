package com.java.courses.threads.races;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger value;

    public void increment() {
        value.incrementAndGet(); //value++
    }

    public void decrement() {
        value.decrementAndGet(); //value--
    }

    public int getValue() {
        return value.get();
    }
}
