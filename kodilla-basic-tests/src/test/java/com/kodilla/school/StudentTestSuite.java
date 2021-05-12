package com.kodilla.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Martin");

    }

    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathAverage = student.getMathAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(3.33, geographyAverage, 0.01);
        assertEquals(3.0, historyAverage, 0.01);
        assertEquals(0, mathAverage, 0.01);
        assertEquals(0, physicsAverage, 0.01);
    }

    @Test
    public void shouldCalculateAveragesIfValuesAreOutsideRange() {
        student.addGeographyGrade(-2);
        student.addGeographyGrade(4);
        student.addGeographyGrade(8);

        student.addMathGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathAverage = student.getMathAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(4.0, geographyAverage, 0.01);
        assertEquals(0, historyAverage, 0.01);
        assertEquals(0, mathAverage, 0.01);
        assertEquals(3, physicsAverage, 0.01);
    }

    @Test
    public void averageShouldBeZeroIfStudentDontHaveGrades() {
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);
        student.addGeographyGrade(-2);
        student.addGeographyGrade(4);
        student.addGeographyGrade(8);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        student.addMathGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);
        assertEquals(2.375, student.getAverage(), 0.01);
    }
}
