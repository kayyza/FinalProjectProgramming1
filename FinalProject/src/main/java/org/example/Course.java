package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@EqualsAndHashCode
@Getter
@Setter
public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> registeredStudents;
    private ArrayList<Double> finalScores;
    private static int nextId = 1;

    /**
     * checks if the sum of weights of all assignments
     * of that course equals to 1
     * @return true or false
     */
    public boolean isAssignmentWeightValid() {
        double sum = 0;
        for (Assignment assignment : assignments) {
             sum += assignment.getWeight();
        }
        return sum == 1;
    }

    /**
     * adds a student to the student list of the course
     * adds a new null element for each assignment
     * adds a new null element to finalScores
     * @param student the input student
     * @return true or false
     */
   public boolean registerStudents(Student student){
       registeredStudents.add(student);
       student.registerCourse(this);

       finalScores.add(null);
       for(Assignment assignment : assignments){
           assignment.getScores().add(null);
       }
       return true;
   }



    //TODO:
    // int[] calcStudentsAverage()
    // calculates the weighted average score of a student.

    //TODO:
    // boolean addAssignment(String assignmentName, double weight, int maxScore)
    // adds a new assignment to the course

    //TODO:
    // void generateScores()
    // generates random scores for each assignment and student,
    // and calculates the final score for each student.

    //TODO:
    // void displayScores()
    // displays the scores of a course in a table,
    // with the assignment averages and student weighted average

    //TODO:
    // String toSimplifiedString()
    // converts a course to a simple string with only the courseId, courseName,
    // credits, and departmentName.

    //TODO:
    // String toString()
    // converts a course to a string that contains
    // the courseId, the courseName, the credits, the departmentName
    // the assignments, and the registeredStudents
    // (only the studentId, the studentName and the departmentName)
}
