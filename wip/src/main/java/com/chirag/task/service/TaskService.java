package com.chirag.task.service;

import com.chirag.task.domain.CreateTaskRequest;
import com.chirag.task.domain.UpdateTaskRequest;
import com.chirag.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task ceateTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);
}
