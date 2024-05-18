package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Address a = new Address(1, "1", "a", "a", "H8Z1C6", "a");
        Department d = new Department("1", "a");
        Student stu = new Student("John Doe", Gender.MALE, a, d);
        Student stu1 = new Student("Jessica Day", Gender.FEMALE, a, d);
        System.out.println(stu1.getStudentId());
    }
}
