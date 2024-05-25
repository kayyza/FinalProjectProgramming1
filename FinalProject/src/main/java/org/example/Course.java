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

//       registeredStudents.add(student);
//       student.getRegisteredCourses().add(this);
//       System.out.println(registeredStudents);
//       finalScores.add(null);
//       for(Assignment assignment : assignments){
//           assignment.getScores().add(null);
//       }
       return true;
   }

   public int[] calcStudentsAverage() {
       int[] scores = new int[registeredStudents.size()];
       for(int i = 0; i < scores.length; i++){
           double total = 0;
           for(Assignment assignment : assignments){
               total += assignment.getScores().get(i) * assignment.getWeight();
           }
           scores[i] = (int)total * 100;
       }
       return scores;
   }

   public boolean addAssignment(String assignmentName, double weight, int maxScore) {
       Assignment assignment = new Assignment(assignmentName, weight, maxScore);
       assignments.add(assignment);
       return true;
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
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department +
                ", assignments=" + assignments +
                ", registeredStudents=" + registeredStudents +
                '}';
    }

    //TODO:
    // int[] calcStudentsAverage()
    // calculates the weighted average score of a student.

    //TODO:
    // void generateScores()
    // generates random scores for each assignment and student,
    // and calculates the final score for each student.

    //TODO:
    // void displayScores()
    // displays the scores of a course in a table,
    // with the assignment averages and student weighted average

}
