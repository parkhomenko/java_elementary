package com.java.courses.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.printSomething();
    }
}
