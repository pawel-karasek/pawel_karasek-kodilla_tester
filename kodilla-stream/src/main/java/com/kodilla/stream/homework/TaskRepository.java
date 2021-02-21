package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("zakupy", LocalDate.now(), LocalDate.of(2021, 02, 20)));
        tasks.add(new Task("nauka", LocalDate.of(2021, 01, 06), LocalDate.of(2021, 04, 28)));
        tasks.add(new Task("wizyta u dentysty", LocalDate.of(2021, 02, 30), LocalDate.of(2021, 02, 31)));
        tasks.add(new Task("wyprowadzić psa", LocalDate.now(), LocalDate.now()));
        tasks.add(new Task("podróżować", LocalDate.of(2022, 02, 20), LocalDate.of(2023, 02, 20)));
        return tasks;
    }
}
