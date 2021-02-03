package com.kodilla.school;

public class Student {
    private String name;
    private Grades math;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.math = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();
    }

    public void addMathGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.math.add(grade);
        }
    }
    public void addPhysicsGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.physics.add(grade);
        }
    }
    public void addGeographyGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.geography.add(grade);
        }
    }
    public void addHistoryGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.history.add(grade);
        }
    }

    public double getMathAverage() {
        return this.math.GetAverage();
    }
    public double getPhysicsAverage() {
        return this.physics.GetAverage();
    }
    public double getGeographyAverage() {
        return this.geography.GetAverage();
    }
    public double getHistoryAverage() {
        return this.history.GetAverage();
    }

    public double getAverage() {
        double sum = this.geography.GetAverage() + this.getHistoryAverage() + this.getMathAverage() + this.getPhysicsAverage();
        return sum/4;
    }
}
