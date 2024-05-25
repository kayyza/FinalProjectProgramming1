package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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

    public Course(String courseId) {
        this.courseId = courseId;
        assignments = new ArrayList<>();
        registeredStudents = new ArrayList<>();
        finalScores = new ArrayList<>();
    }

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
       for(Assignment assignment : assignments){
           assignment.getScores().add(null);
       }
       finalScores.add(null);
       return true;
   }

    /**
     * calculates the weighted average score of a student
     * @return an array with the scores of each student
     */
   public int[] calcStudentsAverage() {
       int[] scores = new int[registeredStudents.size()];
       for(int i = 0; i < scores.length; i++){
           double total = 0;
           for(Assignment assignment : assignments){
               total += (double) assignment.getScores().get(i) / assignment.getMaxScore() * assignment.getWeight();
           }
           scores[i] = (int)(total * 100);
       }
       return scores;
   }

    /**
     * adds a new assignment to the course
     * @param assignmentName given assignment name
     * @param weight assignment weight
     * @param maxScore max score you can get on the assignment
     * @return true or false
     */
   public boolean addAssignment(String assignmentName, double weight, int maxScore) {
       Assignment assignment = new Assignment(assignmentName, weight, maxScore);
       assignments.add(assignment);
       return true;
   }

    /**
     * generates random scores for each assignment and student,
     * and calculates the final score for each student
     */
    public void generateScores(){
        Random rand = new Random();
        for(Assignment assignment : assignments){
            for(int i = 0; i < assignment.getScores().size(); i++){
                assignment.getScores().set(i, rand.nextInt(0, assignment.getMaxScore()));
            }
        }
        for(int i = 0; i < finalScores.size(); i++){
            double total = 0;
            for(Assignment assignment : assignments){
                total += (double) assignment.getScores().get(i) / assignment.getMaxScore() * assignment.getWeight();
            }
            finalScores.set(i, total * 100);
        }
    }

    /**
     * a simplified version of toString
     * @return a simplified string
     */
    public String toSimplifiedString() {
        return courseId + " " + courseName + " " + credits + " " + department.getDepartmentName();
    }

    @Override
    public String toString() {
        ArrayList<String> students = new ArrayList<>();
        for(Student registeredStudent : registeredStudents){
            students.add(registeredStudent.toSimplifiedString() + ", ");
        }
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department +
                ", assignments=" + assignments +
                ", registeredStudents=" + students +
                '}';
    }
}
