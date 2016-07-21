package com.java.courses.threads.races;

public class SyncCounterTest {

    public static void main(String[] args) {

        SynchronizedCounter counter = new SynchronizedCounter(new Counter());
    }
}
