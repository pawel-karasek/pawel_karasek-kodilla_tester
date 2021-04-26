package com.kodilla.hibernate.tasklist.repository;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    TaskListRepository taskListRepository;

    private static final String LISTNAME = "FIRST LIST";
    private static final String DESCRIPTION = "TO DO";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listname = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListRepository.findByListName(listname);

        //Then
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}