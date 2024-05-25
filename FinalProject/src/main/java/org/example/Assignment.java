package org.example;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private ArrayList<Integer> scores;
    private static int nextId = 1;

    public Assignment(String assignmentName, double weight, int maxScore) {
    }

    /**
     * calculates the average score for one assignment
     */
    public void calcAssignmentAvg() {

        double sum = 0;
        for (double num : scores) {
            sum += num;
        }

        double average = sum / scores.size();
        System.out.println(average);
    }

    /**
     * generates random scores for all students in an assignment
     */
    public void generateRandomScore() {
        Random rand = new Random();
        int randomNum = rand.nextInt(0, 11);

        switch (randomNum) {
            case 0 -> rand.nextInt(0, 60);
            case 1, 2 -> rand.nextInt(60, 70);
            case 3, 4 ->  rand.nextInt(70, 80);
            case 5, 6, 7, 8 -> rand.nextInt(80, 90);
            case 9, 10 -> rand.nextInt(90, 101);
        }
    }
    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId='" + assignmentId + '\'' +
                ", assignmentName='" + assignmentName + '\'' +
                ", weight=" + weight +
                ", maxScore=" + maxScore +
                '}';
    }
}
