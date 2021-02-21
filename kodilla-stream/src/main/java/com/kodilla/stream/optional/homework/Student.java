package com.kodilla.stream.optional.homework;

public class Student {
    private static String name;
    private static Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public static String getName() {
        return name;
    }

    public static Teacher getTeacher() {
        return teacher;
    }
}
