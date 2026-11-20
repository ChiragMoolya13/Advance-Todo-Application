package com.chirag.task.mapper.impl;

import com.chirag.task.domain.CreateTaskRequest;
import com.chirag.task.domain.dto.CreateTaskRequestDto;
import com.chirag.task.domain.dto.TaskDto;
import com.chirag.task.domain.entity.Task;
import com.chirag.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()

        );
    }
}
