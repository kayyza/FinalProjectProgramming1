package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private ArrayList<Course> registeredCourses;
    private static int nextId = 9;

    /**
     * registers a student into a course
     * @param course the input course
     * @return true or false
     */
    public boolean registerCourse(Course course) {
        registeredCourses.add(course);
        course.registeredStudents(this);
                                        // appends null for scores of each assignment of course
        return true;
    }

    /**
     * drops a student from a course
     * @param course the input course
     * @return true or false
     */
    public boolean dropCourse(Course course) {
        registeredCourses.remove(course);
        course.registeredStudents(this);
                                        //if the course is not registered yet, directly returns false

        return true;
    }

    Student(String studentName, Gender gender, Address address, Department department) {
        this.studentId = getNextId();
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.registeredCourses = new ArrayList<Course>();
    }

    /**
     * gets the student id in string format
     * @return string student id
     */
    public static String getNextId(){
        String num = Integer.toString(nextId);
        String zeroes = "";
        while (zeroes.length() + num.length() < 5) {
            zeroes += '0';
        }
        nextId++;
        return 'S' + zeroes + num;
    }

    /**
     * a simplified version of toString
     * @return a simplified string
     */
    public String toSimplifiedString() {
        return studentId + " " + studentName + " " + department.getDepartmentName();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", department=" + department +
                ", registeredCourses=" + registeredCourses +
                '}';
    }

    //TODO:
    // If the course is already registered, directly returns false
    // if course is already registered, return false

    //TODO:
    // If the course is not registered yet, directly returns false

    //TODO:
    // This method is called in Course toString().

    //TODO:
    // toString
    // converts a student to a string that contains the studentId, the studentName,
    // the gender, the address and the department, and the registeredCourses
    // (only the courseId, the courseName, and the departmentName)
}
