package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Test;

class TaskTest {

    Task task = new Task("task", 3);

    @Test
    void shouldGetTitle() {
        System.out.println(task.getTitle());
    }

    @Test
    void shouldGetDuration() {
        System.out.println(task.getDuration());
    }
}