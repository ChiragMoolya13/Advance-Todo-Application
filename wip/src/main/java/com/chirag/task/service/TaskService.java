package com.chirag.task.service;

import com.chirag.task.domain.CreateTaskRequest;
import com.chirag.task.domain.entity.Task;

import java.util.List;

public interface TaskService {

    Task ceateTask(CreateTaskRequest request);

    List<Task> listTasks();
}
