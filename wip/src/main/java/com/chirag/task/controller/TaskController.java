package com.chirag.task.controller;

import com.chirag.task.domain.CreateTaskRequest;
import com.chirag.task.domain.dto.CreateTaskRequestDto;
import com.chirag.task.domain.dto.TaskDto;
import com.chirag.task.domain.entity.Task;
import com.chirag.task.mapper.TaskMapper;
import com.chirag.task.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @PostMapping
    public ResponseEntity<TaskDto> createTask(
         @Valid @RequestBody CreateTaskRequestDto createTaskRequestDto
    ){
       CreateTaskRequest createTaskRequest = taskMapper.fromDto(createTaskRequestDto);
       Task task = taskService.ceateTask(createTaskRequest);
       TaskDto createTaskDto = taskMapper.toDto(task);
       return new ResponseEntity<>(createTaskDto, HttpStatus.CREATED);
    }

    public ResponseEntity<List<TaskDto>> listTasks(){
        List<Task> tasks = taskService.listTasks();
        List<TaskDto> taskDtos = tasks.stream().map(taskMapper::toDto).toList();
        return ResponseEntity.ok(taskDtos);

    }
}
