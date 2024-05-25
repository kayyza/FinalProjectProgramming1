package org.example;


import util.Util;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Address a = new Address(1, "1", "a", "a", "H8Z1C6", "a");
        Department d = new Department("a");
        Student stu = new Student("John Doe", Gender.MALE, a, d);
        Student stu1 = new Student("Jessica Day", Gender.FEMALE, a, d);
        Course c = new Course("C-D01-01");
        System.out.println(c.getRegisteredStudents());
        c.addAssignment("name", .4, 100);
        c.addAssignment("name", .6, 100);
        stu.registerCourse(c);
        stu1.registerCourse(c);
        c.generateScores();
        System.out.println(c.getFinalScores());
        System.out.println(Util.toTitleCase("i am testing my string"));
    }
}
