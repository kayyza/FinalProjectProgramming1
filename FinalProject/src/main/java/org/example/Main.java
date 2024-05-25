package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Address a = new Address(1, "1", "a", "a", "H8Z1C6", "a");
        Department d = new Department("a");
        Student stu = new Student("John Doe", Gender.MALE, a, d);
        Student stu1 = new Student("Jessica Day", Gender.FEMALE, a, d);
        Course c = new Course("C-D01-01");
        stu.registerCourse(c);
        stu1.registerCourse(c);
        System.out.println(c.getRegisteredStudents());
        System.out.println(Arrays.toString(c.calcStudentsAverage()));
    }
}
