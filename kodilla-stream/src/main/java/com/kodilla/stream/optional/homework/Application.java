package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Paweł", new Teacher("Wojtek")));
        studentList.add(new Student("Piotr", new Teacher("Adam")));
        studentList.add(new Student("Robert", null));

        for (Student student : studentList
        ) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            Student teacherless = new Student(student.getName(), optionalTeacher.orElse(new Teacher("<undefined>")));
            System.out.println("uczeń: " + teacherless.getName() + ", nauczyciel: " + teacherless.getTeacher());
        }
    }
}
