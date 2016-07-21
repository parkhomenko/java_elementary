package com.java.courses.threads.immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Date date = new Date(1990, 5, 5);

        Student student = new Student("Sam", 25, date);
        Date birthday = student.getBirthday();
        birthday.setYear(1984);

        date.setYear(2005);

        List list = Collections.synchronizedList(new ArrayList<Object>());
    }
}
