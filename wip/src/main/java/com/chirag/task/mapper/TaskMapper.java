package com.chirag.task.mapper;

import com.chirag.task.domain.CreateTaskRequest;
import com.chirag.task.domain.dto.CreateTaskRequestDto;
import com.chirag.task.domain.dto.TaskDto;
import com.chirag.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
