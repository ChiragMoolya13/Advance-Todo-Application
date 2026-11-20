package com.chirag.task.domain;

import com.chirag.task.domain.entity.TaskPriority;
import com.chirag.task.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
