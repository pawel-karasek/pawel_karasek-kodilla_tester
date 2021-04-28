package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

public interface TaskFinancialDetailsRepository extends CrudRepository<TaskList, Integer> {

}
