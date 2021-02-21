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

        for (Student students : studentList
             ) {
            System.out.println(studentList);
        }
        Optional<Student> optionalStudent = Optional.ofNullable();

    }
}
